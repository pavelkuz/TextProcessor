package entity;

/**
 * Created by Pavel on 18.06.2015.
 */
public interface Composite<E extends Component> extends Component<E> {
    void add(E element);

    //    String completeString();
//    void add(String s);
}
