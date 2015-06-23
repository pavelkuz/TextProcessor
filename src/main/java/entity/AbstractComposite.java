package entity;

import java.util.List;

/**
 * Created by Pavel on 18.06.2015.
 */
public abstract class AbstractComposite<E extends Component> implements Composite<E> {
    private List<E> elements;

    //private E elements;

//    public AbstractComposite(E elements) {
//        this.elements = elements;
//    }

//    public AbstractComposite() {
//    }

    @Override
    public void add(E element) {
        elements.add(element);
    }

//    public String completeString() {
//        StringBuilder sb = new StringBuilder();
//        for (E element : elements) {
//            sb.append(element.toString());
//        }
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}
