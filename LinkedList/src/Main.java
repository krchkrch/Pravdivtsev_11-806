import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");



        ArrayDeque<String> states = new ArrayDeque<String>();
        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.addLast("Spain");
        states.add("Italy");


        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast);

        System.out.printf("Queue size: %d \n", states.size());


        while(states.peek()!=null){
            System.out.println(states.pop());
        }
    }
}