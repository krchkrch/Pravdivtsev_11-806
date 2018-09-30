import java.util.Scanner;

public class hw06_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Введите строки: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String buf = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = buf;
                }
            }
        }
        System.out.println("Массив, отсортированный по возрастанию длин строк: " );
        for (String s : str){
            System.out.print(  s + " ");
        }
    }
}