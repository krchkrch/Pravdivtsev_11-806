import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int n = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (Math.abs(x) > a) {
                a = Math.abs(x);
            }


        }
        System.out.println(a);
    }
}