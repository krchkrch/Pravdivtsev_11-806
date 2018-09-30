import java.util.Scanner;

public class hw07_F {

    public static int digits(int a) {
        if (a<10)
            return a;

        else {
            System.out.println(a%10);
            return digits(a/10);
        }
    }
            public static void main(String[] args) {
                System.out.println("Введите число: ");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                System.out.println(digits(a));

    }
}
