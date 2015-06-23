import entity.*;
import org.boon.Boon;
import util.TextParser;

public class Main {

    public static void main(String[] args) {
        TextParser parser = new TextParser();
        String sourceString = String.valueOf(parser.parseSourceString("Book.txt"));
        System.out.println(sourceString);
        System.out.println(Boon.toPrettyJson(parser.parse(sourceString, Text.class)));
    }
}