 import java.util.Scanner;

public class hw01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > a) {
                b = a;
                a = x;
            } else if (x > b)
                b = x;
        }



        System.out.println(a);
        System.out.println(b);
}
}