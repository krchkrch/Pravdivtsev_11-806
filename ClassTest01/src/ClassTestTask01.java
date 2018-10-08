import java.util.Scanner;

public class ClassTestTask01 {
    public static void main(String[] args) {
        System.out.println("Введите n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n * n;
        int arr[] = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        sortArr(arr);

        for (int z = 0; z < x; z++) {
            System.out.print(arr[z] + " ");
        }

        System.out.println();

        int[][] matrix = new int[n][n];
        spiralFill(matrix, arr, n);
    }

    static int summa(int a) {
        int sum = 0;
        while (a != 0) {
            sum += (a % 10);
            a /= 10;
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int q = arr[j];
                int e = arr[j + 1];
                if (summa(q) > summa(e)) {
                    int buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }
    }

    static void spiralFill(int[][] matrix, int[] arr, int n) {
        int z=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = arr[z];
                z++;
            }
            for (int j = i + 1; j < n - i; j++) {
                matrix[j][n - i - 1] = arr[z];
                z++;
            }
            for (int j = n - i - 2; j >= i; j--) {
                matrix[n - i - 1][j] = arr[z];
                z++;
            }
            for (int j = n - i - 2; j >= i + 1; j--) {
                matrix[j][i] = arr[z];
                z++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }

    }
