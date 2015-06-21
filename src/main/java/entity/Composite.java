package entity;

/**
 * Created by Pavel on 18.06.2015.
 */
public interface Composite<E extends  Component> extends Component<E> {
    E getPart();
    boolean contains(E element);

    void add(String s);
}
