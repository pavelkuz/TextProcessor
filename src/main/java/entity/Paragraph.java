package entity;

/**
 * Created by Pavel on 18.06.2015.
 */
public class Paragraph extends AbstractComposite<Sentence> implements Composite<Sentence> {

    public Paragraph() {
        super();
    }

//    @Override
//    public void add(String s) {
//        sentences.add(s);
//    }

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

//    @Override
//    public String completeString() {
//        return super.completeString();
//    }
}
