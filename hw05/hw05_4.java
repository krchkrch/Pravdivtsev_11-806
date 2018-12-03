import java.util.Scanner;

public class hw05_4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.next();
        System.out.println("Введите ключ (l - lower case/u - upper case): ");
        String key = sc.next();
        if (key.equals("l")) {
            str = str.toLowerCase();
        } else {
            str = str.toUpperCase();
        }
        System.out.println("Полученная строка: " + str);
    }
}