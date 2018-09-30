import java.util.Scanner;

public class hw07_J {

    public static String check(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return check(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
            public static void main(String[] args) {
                System.out.println("Введите строку: ");
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                System.out.println(check(s));

    }
}
