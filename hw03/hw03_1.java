import java.util.Scanner;


public class hw03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double avg = 0;
        if (n > 0) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j];
            }
            avg = sum / n;
        }
        int count = 0;
        for (int k = 0; k < n; k++)
            if (arr[k] > avg) {
                count += 1;
            }
        System.out.println(avg + " cm");
        System.out.println(count);
    }


}



