import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        double a = 0;
        int r = 1;
        while (true) {
            int n = 0;
            System.out.println("Если вы хотите продолжить введите число не равное 0 (0 - выход)");
            n = sc.nextInt();
            if (n == 0) break;
            if (r == 1) {
                result = 0;
                System.out.println("Введите первое число:");
                a = sc.nextDouble();
            } else {
                a = result;
            }
            System.out.println("Введите оператор:");
            String op = sc.next();
            System.out.println("Введите второе число:");
            double b = sc.nextDouble();
            if (op.equals("+")) {
                result = a + b;
            } else if (op.equals("-")) {
                result = a - b;
            } else if (op.equals("*")) {
                result = a * b;
            } else if (op.equals("/")) {
                result = a / b;
            }


            System.out.println(result);
            System.out.println("Сбросить результат? 1 - да | 0 - нет");
            r = sc.nextInt();
        }

    }
}