import java.util.Scanner;


public class hw08_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iA = sc.nextInt();
        int jA = sc.nextInt();
        int iB = sc.nextInt();
        int jB = sc.nextInt();
        int[][] matrixA = new int[iA][jA];
        int[][] matrixB = new int[iB][jB];
        int[][] newMatrix = new int[iA][jB];

        for (int i = 0; i < iA; i++) {
            for (int j = 0; j < jA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < iB; i++) {
            for (int j = 0; j < jB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        int multiply = 0;
        int count = 0;
        int offset = 0;
        for (int i = 0; i < iA; i++) {
            for (int j = 0; j < jA; j++) {
                multiply += matrixA[i][j] * matrixB[j][offset];
                if (count == iB - 1 && offset != jB) {
                    newMatrix[i][offset] = multiply;
                    j = -1;
                    multiply = 0;
                    count = 0;
                    offset += 1;
                } else {
                    count += 1;
                }
                if (offset == jB) {
                    j = jA;
                    offset = 0;
                }
            }
        }

        for (int i = 0; i < iA; i++) {
            for (int j = 0; j < jB; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}