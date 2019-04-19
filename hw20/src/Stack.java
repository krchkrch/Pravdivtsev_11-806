public class Stack {
    Node tail;

    public void push(char a){
        tail = new Node(a,tail);
    }

    public char pop(){
        char a = tail.getValue();
        tail = tail.getTail();
        return a;
    }

    public boolean isEmpty(){
        return tail == null;
    }

    public void printStack(){
        Node qwert = tail;
        while(qwert != null){
            System.out.println(qwert.getValue());
            qwert = qwert.getTail();
        }
    }
}
