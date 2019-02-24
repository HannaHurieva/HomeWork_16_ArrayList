package SimpleList;

public interface MyList<E> extends Iterable<E> {
    boolean add(E e);
    void remove(int index);
    E get(int index);
    int size();
    void set(int index,E e);
}
