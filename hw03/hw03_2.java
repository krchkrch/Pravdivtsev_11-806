import java.util.Scanner;


public class hw03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите кол-во элементов массива: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("¬ведите элементы массива:");
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
        System.out.println("»ндекс максимального элемента массива: " + IndexOfMax);
    }


}



