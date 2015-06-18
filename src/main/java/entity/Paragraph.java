package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.06.2015.
 */
public class Paragraph extends AbstractComposite<Sentence> implements Composite<Sentence> {
    private String paragraph;

    public Paragraph(){}

    public Paragraph(String paragraph) {
        this.paragraph=paragraph;
    }

    @Override
    public Sentence getPart() {
//        for (Sentence s : paragraph)
//            Sentence sentence = paragraph.add(s);
//
//        return sentence;
        return null;
    }

    @Override
    public boolean contains(Sentence element) {
        return false;
    }

    @Override
    public Sentence get(int index) {
        return null;
    }

    @Override
    public void add(Sentence sentence) {
        super.add(sentence);
    }

    @Override
    public Sentence remove(int index) {
        return null;
    }

    @Override
    public Sentence remove(Sentence element) {
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
