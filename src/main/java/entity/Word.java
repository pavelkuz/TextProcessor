package entity;

import org.boon.Str;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Word {
    private static String word;

    public Word(String word){
        this.word=word;
    }
    public static String getWord(List<String> text) {
        String linesAsArray = text.toArray(new String[text.size()]).toString();
        word = String.valueOf(linesAsArray.trim().split("[,;:.!?\\s]+"));
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
