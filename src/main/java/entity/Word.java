package entity;

import org.boon.Str;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Word extends AbstractComposite<Symbol> implements Composite<Symbol> {
    private String word;

    public Word(){}

    public Word(String word) {
        this.word=word;
    }

    @Override
    public void add(Symbol element) {
        super.add(element);
    }

    @Override
    public Symbol getPart() {
        return null;
    }

    @Override
    public boolean contains(Symbol element) {
        return false;
    }

    @Override
    public Symbol get(int index) {
        return null;
    }

    @Override
    public Symbol remove(int index) {
        return null;
    }

    @Override
    public Symbol remove(Symbol element) {
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
