import java.util.Scanner;

public class hw07_H {

    public static boolean check(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return check(n, i + 1);
        } else {
            return true;
        }
    }
            public static void main(String[] args) {
                System.out.println("Введите число: ");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int i = 2;
                System.out.println(check(a,i));

    }
}
