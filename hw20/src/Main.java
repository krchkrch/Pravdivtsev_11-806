public class Main {


    public static void main(String[] args) {
        Stack a = new Stack();
        a.push('6');
        a.push('5');
        a.push('4');
        a.push('3');
        a.push('2');
        a.push('1');
        a.printStack();
        System.out.println();
        a.pop();
        a.pop();
        a.push('b');
        a.push('a');
        a.printStack();
    }
}