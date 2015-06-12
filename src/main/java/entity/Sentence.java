package entity;

import org.boon.Str;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Sentence {
    private List<String> sentence;

    public Sentence(){
        sentence=new ArrayList();
    }

    public List<String> getSentence() {
        return sentence;
    }

    public void setSentence(List<String> sentence) {
        this.sentence = sentence;
    }
}
