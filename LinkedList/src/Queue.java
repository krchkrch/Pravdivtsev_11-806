public interface Queue<E> extends Collection {
    E element();

    boolean offer(E obj);

    E peek();

    E poll();

    E remove();

}

