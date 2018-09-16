import java.util.Scanner;

public class hw01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0)
                sumEven += x;
            else
                sumOdd += x;
        }


        System.out.println(sumEven - sumOdd);
    }
}