import java.util.Scanner;

public class hw06_4 {

    public static void main(String[] args) {
        System.out.println("Введите количество элементов: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        check(arr, n);
    }

    static void check(int[] arr, int n) {
        boolean unique = false;
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (i < n) {
                if (arr[j] == arr[i]) {
                    unique = true;
                }
                i++;
            }
            j++;
        }
        System.out.println(unique);
    }
}