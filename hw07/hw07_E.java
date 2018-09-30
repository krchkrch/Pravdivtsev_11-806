import java.util.Scanner;

public class hw07_E {

    public static int summa(int a) {
        if (a<10)
            return a;

        else {
            return a%10 + summa(a/10);
        }
    }
            public static void main(String[] args) {
                System.out.println("Введите число: ");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                System.out.println(summa(a));

    }
}
