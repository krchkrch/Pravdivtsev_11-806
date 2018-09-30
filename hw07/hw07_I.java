import java.util.Scanner;

public class hw07_I {

    public static void check(int a, int i) {
        if (i > a / 2) {
            System.out.println(a);
            return;
        }
        if (a % i == 0) {
            System.out.println(i);
            check(a / i, i);
        }
        else {
            check(a, ++i);
        }
    }
            public static void main(String[] args) {
                System.out.println("Введите число: ");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int i = 2;
                check(a,i);

    }
}
