public class GenNode<T> {
    private GenNode next;
    private T value;


    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setNext(GenNode next){
        this.next = next;
    }

    public GenNode getNext(){
        return next;
    }
}