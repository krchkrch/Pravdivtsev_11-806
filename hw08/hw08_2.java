import java.util.Scanner;


public class hw08_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int sumRow = 0;
        int lastSumRow = 0;
        int indexRow = 0;

        int sumColumn = 0;
        int lastSumColumn = 0;
        int indexColumn = 0;

        int offset = 0;

        for (int j = 0; j < n; j++) {
            if (offset == 0) {
                for (int i = 0; i < m; i++) {
                    sumColumn += array[i][j];
                    if (i == m - 1 && sumColumn > lastSumColumn) {
                        indexColumn = j;
                        lastSumColumn = sumColumn;
                    }
                }
            }

            sumRow += array[offset][j];
            if (j == n - 1 && sumRow > lastSumRow) {
                indexRow = offset;
                lastSumRow = sumRow;
                sumRow = 0;
                offset++;
                j = -1;
            }
            sumColumn = 0;
            if (offset - 1 == m - 1) j = n;
        }

        System.out.println("Строка:");
        for (int j = 0; j < n; j++) {
            System.out.print(array[indexRow][j] + " ");
        }

        System.out.println();

        System.out.println("Столбец:");
        for (int i = 0; i < m; i++) {
            System.out.println(array[i][indexColumn]);
        }
    }
}