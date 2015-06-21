package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Sentence extends AbstractComposite<SentencePart> implements Composite<SentencePart> {
    private List<String> words=new ArrayList<>();

    public Sentence(){
    }

    @Override
    public SentencePart get(int index) {
        return null;
    }

    @Override
    public SentencePart remove(int index) {
        return null;
    }

    @Override
    public SentencePart remove(SentencePart element) {
        return null;
    }

    @Override
    public String completeString() {
        return super.completeString();
    }

    @Override
    public SentencePart getPart() {
        return null;
    }

    @Override
    public boolean contains(SentencePart element) {
        return false;
    }

    @Override
    public void add(String s) {

    }
}
