package runner;

import entity.Sentence;
import entity.Word;
import org.boon.Boon;
import util.SentenceParser;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text=SentenceParser.parse("C:\\book.txt");
        System.out.println(text);
        System.out.println(Word.getWord(text));
    }
}