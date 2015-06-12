package util;

import entity.Sentence;
import org.apache.log4j.Logger;
import org.boon.Str;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pavel on 10.06.2015.
 */
public class SentenceParser {
    private static final Logger LOGGER = Logger.getLogger(SentenceParser.class);
    private static List<String> text;

    public SentenceParser(){
        this.text=new ArrayList<String>();
    }

    public static List<String> parse(String filePath){
        LOGGER.info("File parsing start!");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            text = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                text.add(line);
            }
        }
        catch (FileNotFoundException error){
            LOGGER.error("File not found: "+error);
        } catch (IOException ioError) {
            LOGGER.error("Something wrong in parsing process: " + ioError);
        }
        LOGGER.info("File parse succeed!");
        return text;
    }
}
