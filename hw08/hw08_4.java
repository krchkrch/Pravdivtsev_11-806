import java.util.Scanner;


public class hw08_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[] min = new int[n];
        for (int i = 0; i < n; i++) {
            min[i] = array[i][0];
            for (int j = 0; j < m; j++) {
                if (array[i][j] < min[i]) {
                    min[i] = array[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == min[i]) {
                    boolean isMax = true;
                    for (int k = 0; k < n; k++) {
                        if (array[k][j] > min[i]) {
                            isMax = false;
                        }
                        if (k == n - 1 && isMax) {
                            System.out.println(array[i][j]);
                        }
                    }
                }
            }
        }
    }
}