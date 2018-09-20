import java.util.Scanner;


public class hw03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int IndexOfMax = 0;
        for (int j = 0; j < arr.length; j++)
            if (arr[j] > max) {
                max = arr[j];
                IndexOfMax = j;
            }
        System.out.println(IndexOfMax);
    }


}



