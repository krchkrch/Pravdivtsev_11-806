import java.util.Scanner;

public class hw07_G {

    public static String digits(int a) {
        if (a < 10) {
            return Integer.toString(a);
        }
        else {
            return digits(a / 10) + " " + a % 10;
        }
    }
            public static void main(String[] args) {
                System.out.println("Введите число: ");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                System.out.println(digits(a));

    }
}
