import javax.xml.soap.Node;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class GenLinkedList<T> implements Iterable<T> {
    private int count = 0;
    private GenNode head;
    private GenNode tail;


    public Stream stream() {
        return new Stream();
    }

    public class Stream {
        private GenLinkedList<T> linkedList = new GenLinkedList<>();

        public Stream() {
            MyIterator iterator = new MyIterator();
            while (iterator.hasNext()) {
                linkedList.add(iterator.next());
            }
        }

        public Stream Map(Function<T, T> func) {
            GenLinkedList<T> linkedList = new GenLinkedList<>();


            for (T element : this.linkedList) {
                linkedList.add(func.apply(element));
            }

            this.linkedList = linkedList;
            return this;
        }

        public Stream forEach(Consumer<T> consumer) {
            for (T element : linkedList) {
                consumer.accept(element);
            }

            return this;
        }

        public Stream Filter(Predicate<T> predicate) {
            GenLinkedList<T> linkedList = new GenLinkedList<>();

            for (T element : linkedList) {
                if (predicate.test(element))
                    linkedList.add(element);
            }
            this.linkedList = linkedList;
            return this;
        }
    }

    public void add(T value) {
        GenNode current = new GenNode<>();
        current.setValue(value);
        current.setNext(null);

        if (head != null) {
            tail.setNext(current);
            tail = tail.getNext();
        } else {
            head = current;
            tail = head;
        }
        count++;
    }

    public int size() {
        return count;
    }

    public void remove(int index) {
        if (index < 0 || count < index)
            throw new IllegalArgumentException("Index - " + index + " invalid");

        if (index == 0) {
            head = head.getNext();
            count--;
        }

        GenNode node = head;

        if (head != null) {
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }

            isTail(node);
            node.setNext(node.getNext().getNext());

            count--;
        } else {
            throw new IllegalArgumentException(index + "- invalid index");
        }
    }

    private void isTail(GenNode node) {
        if (node.getNext() == tail)
            tail = node;
    }

    public T[] getLinkedList() {
        T[] print = (T[]) new Object[size()];

        GenNode node = head;
        for (int i = 0; i < size(); i++) {
            print[i] = (T) node.getValue();
            node = node.getNext();
        }
        return print;
    }

    public T getNodeValue(int index) {
        if (index < 0 || count < index)
            throw new IllegalArgumentException("Index - " + index + " invalid");

        GenNode node = head;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return (T) node.getValue();
    }

    public boolean contains(T value) {
        GenNode node = head;

        for (int i = 0; i < size(); i++) {
            if (value == (T) node.getValue())
                return true;
            node = node.getNext();
        }

        return false;
    }

    public void addAll(GenLinkedList list) {
        tail.setNext(list.head);
        tail = list.tail;
        count += list.size();
    }

    public void addAll(GenLinkedList list, int index) {
        if (index == 0) {
            list.tail.setNext(head);
            head = list.head;
        } else {
            GenNode node = head;

            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }

            tail = node;
            node = node.getNext();
            list.tail.setNext(node);
            tail.setNext(list.head);
        }

        count += list.size();
        tail = list.tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<T> {
        private int Index = 0;

        @Override
        public boolean hasNext() {
            return Index < count;
        }

        @Override
        public T next() {
            GenNode node = head;
            for (int i = 0; i < Index; i++) {
                node = node.getNext();
            }
            Index++;
            return (T) node;
        }
    }
}