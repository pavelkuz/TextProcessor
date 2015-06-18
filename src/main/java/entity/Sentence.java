package entity;

import org.boon.Str;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Sentence extends AbstractComposite<Word> implements Composite<Word> {
    private String sentence;

    public Sentence(){}

    public Sentence(String sentence) {
        this.sentence=sentence;
    }

    @Override
    public Word getPart() {
        return null;
    }

    @Override
    public boolean contains(Word element) {
        return false;
    }

    @Override
    public Word get(int index) {
        return null;
    }

    @Override
    public void add(Word word) {
        super.add(word);
    }

    @Override
    public Word remove(int index) {
        return null;
    }

    @Override
    public Word remove(Word element) {
        return null;
    }

    @Override
    public String completeString() {
        return null;
    }

//    @Override
//    public String completeString() {
//        return super.completeString();
//    }
}
