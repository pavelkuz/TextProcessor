package util;

import entity.*;
import org.apache.log4j.Logger;
import org.boon.Str;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 10.06.2015.
 */
public class TextParser {
    private static final Logger LOGGER = Logger.getLogger(TextParser.class);
    private List<String> text= new ArrayList<>();

    public StringBuilder parseSource(String sourceText){
        LOGGER.info("File parsing start!");
        String readedText;
        StringBuilder sourceString = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceText));
            while ((readedText = reader.readLine()) != null) {
                text.add(readedText);
            }
            LOGGER.info("File parse succeed!");
        }
        catch (FileNotFoundException error){
            LOGGER.error("File not found: "+error);
        } catch (IOException ioError) {
            LOGGER.error("Something wrong in parsing process: " + ioError);
        }
        for (String get : text) sourceString.append(get);

        return sourceString;
    }

    public List<Symbol> parseSymbol(String string) {
        List<Symbol> symbols = new ArrayList<>();
        Symbol symbol = new Symbol();
        for (int i = 0; i < string.length(); i++) {
            symbol = new Symbol(string.charAt(i));
            symbols.add(symbol);
        }
        return symbols;
    }

    public List<Word> parseWord(String sourceString){
        List<Word> word = new ArrayList<>();
        String[] takenWords = sourceString.split("[,;:.!?\\s]+");
        for (String s : takenWords)
            word.add(new Word(s));
        return word;
    }

    public List<Sentence> parseSentence(String inputParagraph){
        List<Sentence> sentence = new ArrayList<>();
        String[] takenSentence = inputParagraph.split("(?<=[.!?])");
        for (String s : takenSentence)
            sentence.add(new Sentence(s));
        return sentence;
    }

    public List<Paragraph> parseParagraph(String inputText){
        List<Paragraph> paragraph = new ArrayList<>();
        String[] sentences = inputText.split("(?<=[\\n])");
        for (String s : sentences) {
            paragraph.add(new Paragraph(s));
        }
        return paragraph;
    }
}
