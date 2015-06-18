package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.06.2015.
 */
public class Text extends AbstractComposite<Paragraph> implements Composite<Paragraph> {
    private List<Paragraph> text = new ArrayList<>();

    public Text(){}

    public Text(List<Paragraph> paragraphs){
        super(paragraphs);
    }

    @Override
    public void add(Paragraph element) {
        super.add(element);
    }

    @Override
    public Paragraph getPart() {
        return null;
    }

    @Override
    public boolean contains(Paragraph element) {
        return false;
    }

    @Override
    public Paragraph get(int index) {
        return null;
    }

    @Override
    public Paragraph remove(int index) {
        return null;
    }

    @Override
    public Paragraph remove(Paragraph element) {
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