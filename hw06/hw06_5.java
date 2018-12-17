import java.util.Scanner;

public class hw06_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] aArray = new int[a];
        int[] bArray = new int[b];

        for (int i = 0; i < a; i++) {
            aArray[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            bArray[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (aArray[i] == bArray[j]) {
                    count++;
                }
            }
        }

        System.out.println(a + b - 2 * count);
    }
}
