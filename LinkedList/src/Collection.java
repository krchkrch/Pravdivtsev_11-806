import java.util.Iterator;

public interface Collection<T>{
    void add(T element);

    void add(T element, int position);

    Node<T> get(int position);

    int size();

    Node<T>[] toArray();

    boolean contains(T element);

    void remove(int position);

    void addAll(Collection<T> elements);

    void addAll(Collection<T> elements, int position);

    Iterator<Node<T>> getIterator();
}
