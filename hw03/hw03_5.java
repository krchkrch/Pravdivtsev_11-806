import java.util.Scanner;



public class hw03_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        String str = "";
        for (int i = 0; i < n; i++) {
            str += number[i];
        }

        System.out.println(Integer.parseInt(str));
    }
}