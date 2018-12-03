import java.util.Scanner;

public class hw05_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.next();
        char[] arr = str.toCharArray();
        int arrayToInt = 0, a = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = Character.digit(arr[i], 10);
            while (digit > 0) {
                arrayToInt += digit % 10 * a;
                digit /= 10;
                a *= 10;
            }
        }
        System.out.println("Строка, преобразованная в целочисленное значение: " + arrayToInt);
    }
}