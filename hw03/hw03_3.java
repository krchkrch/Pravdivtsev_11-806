import java.util.Scanner;


public class hw03_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int j = 1; j < n - 1; j++)
            if ((arr[j] > arr[j - 1]) & (arr[j] > arr[j + 1])) {
                count += 1;
            }
        if (arr[0] > arr[1]) {

            count += 1;
        }
        if (arr[n - 1] > arr[n - 2]) {
            count += 1;
        }
        System.out.println(count);
    }
}



