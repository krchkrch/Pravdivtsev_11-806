import java.util.Scanner;

public class hw06_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Длина самой длинной цепочки = " + length(arr, n));
    }

    static int length(int[] arr, int n) {
        int l = 1;
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                max++;
            } else {
                if (max < l) {
                    max = l;
                }
                l = 1;
            }
        }
        return max;
    }
}