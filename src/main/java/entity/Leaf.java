package entity;

/**
 * Created by Pavel on 18.06.2015.
 */
public interface Leaf<E extends Component> extends Component<E> {
    E replace(E element, E newElement);
}
