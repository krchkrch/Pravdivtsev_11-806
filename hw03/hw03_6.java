import java.util.Scanner;

public class hw03_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < n/2; i++) {
            int a = number[i];
            number[i] = number[n-i-1];
            number[n-i-1] = a;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
