package util;

import entity.Composite;
import entity.Leaf;
import entity.Letter;
import entity.Word;
import org.apache.log4j.Logger;
import org.boon.Boon;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.*;

/**
 * Created by Pavel on 10.06.2015.
 */
public class TextParser {
    private static final Logger LOGGER = Logger.getLogger(TextParser.class);
    private Map<Class<? extends Composite>,String> regexes = new HashMap<Class<? extends Composite>,String>();

    public StringBuilder parseSourceString(String sourceText) {
        List<String> text = new ArrayList<>();
        LOGGER.info("File parsing start!");
        String readedText;
        StringBuilder sourceString = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceText));
            while ((readedText = reader.readLine()) != null) {
                text.add(readedText);
            }
            LOGGER.info("File parse succeed!");
        } catch (FileNotFoundException error) {
            LOGGER.error("File not found: " + error);
        } catch (IOException ioError) {
            LOGGER.error("Something wrong in parsing process: " + ioError);
        }
        for (String get : text) sourceString.append(get.replaceAll("\\s+", " "));

        return sourceString;
    }

    public <T extends Composite> T parse(String inputString, Class<T> selectedTextComponent){
        LOGGER.info("Received entity! " + selectedTextComponent.getName());
        ParameterizedType type = (ParameterizedType) selectedTextComponent.getGenericSuperclass();
        Class componentClass = (Class) type.getActualTypeArguments()[0];
        LOGGER.info("Split for entities! " + componentClass.getName());
        T classInstance = null;
        List<String> parsedEntities = new ArrayList<>();
        char[] letters= new char[10];
        if (!componentClass.getName().equals("entity.Letter")) {
            LOGGER.info("Load properties for parse.");
            Properties properties = new Properties();
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("parser.properties");
                properties.load(inputStream);
                LOGGER.info("Properties loaded!");
            } catch (IOException e) {
                LOGGER.error("Something wrong with loading properties: " + e);
            }
            String regex = properties.getProperty(componentClass.getName());
            LOGGER.info("Chosen regex: " + regex);
            try {
                classInstance = (T) componentClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            String[] takenText = inputString.split(regex);
            for (String s : takenText) {
                parsedEntities.add(s);
            }
            System.out.println(Boon.toPrettyJson(parsedEntities));
            for (String s : parsedEntities)
                classInstance.add(parse(inputString, componentClass));
        }
        return classInstance;
    }
}
