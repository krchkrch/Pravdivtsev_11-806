import java.util.Scanner;

public class hw05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        double a = 0;
        int r = 1;
        while (true) {
            int n = 0;
            System.out.println("���� �� ������ ���������� ������� ����� �� ������ 0 (0 - �����)");
            n = sc.nextInt();
            if (n == 0) break;
            if (r == 1) {
                result = 0;
                System.out.println("������� ������ �����:");
                a = sc.nextDouble();
            } else {
                a = result;
            }
            System.out.println("������� ��������:");
            String op = sc.next();
            System.out.println("������� ������ �����:");
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
            System.out.println("�������� ���������? 1 - �� | 0 - ���");
            r = sc.nextInt();
        }

    }
}