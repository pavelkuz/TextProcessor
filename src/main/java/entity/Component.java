package entity;

/**
 * Created by Pavel on 18.06.2015.
 */
public interface Component<E extends Component> {
    E get(int index);

    E remove(int index);

    E remove(E element);
}
