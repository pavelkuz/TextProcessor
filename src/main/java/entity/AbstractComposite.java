package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 18.06.2015.
 */
public abstract class AbstractComposite<E extends Component> implements Composite<E> {
    private List<E> composite = new ArrayList<>();

    public AbstractComposite(List<E> textElement){
        this.composite = textElement;
    }

    public AbstractComposite(){}

    @Override
    public void add(E element) {
        composite.add(element);
    }

//    public String completeString() {
//        StringBuilder sb = new StringBuilder();
//        for (E element : composite) {
//            sb.append(element.toString());
//        }
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}
