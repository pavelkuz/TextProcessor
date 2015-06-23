package entity;

/**
 * Created by Pavel on 18.06.2015.
 */
public class Text extends AbstractComposite<Paragraph> implements Composite<Paragraph> {

    public Text() {
        super();
    }

    @Override
    public void add(Paragraph paragraph) {
        super.add(paragraph);
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

//    @Override
//    public String completeString() {
//        return super.completeString();
//    }
}
