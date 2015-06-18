import entity.Sentence;
import entity.Word;
import org.boon.Boon;
import util.TextParser;
import util.TextParser;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TextParser parser = new TextParser();
        String sourceString = String.valueOf(parser.parseSource("C:\\book.txt"));
        System.out.println(sourceString);
        System.out.println(Boon.toPrettyJson(parser.parseParagraph(sourceString)));
        System.out.println(Boon.toPrettyJson(parser.parseSentence(sourceString)));
        System.out.println(Boon.toPrettyJson(parser.parseWord(sourceString)));
        System.out.println(Boon.toPrettyJson(parser.parseSymbol(sourceString)));
        //System.out.println(Word.getWord(text));
    }
}