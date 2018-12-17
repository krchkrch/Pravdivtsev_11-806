import java.util.Scanner;

public class hw03_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        boolean check = false;
        boolean toogle = false;

        for (int i = 0; i < n-1; i++) {
            if (number[i] <= number[i+1] && toogle == false) {
                check = true;
            } else if (number[i] >= number[i+1]) {
                toogle = true;
            } else {
                check = false;
            }
        }

        System.out.println(check);
    }
}
