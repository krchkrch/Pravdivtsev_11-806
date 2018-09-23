import java.util.Scanner;

public class hw05_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String firstStr = sc.nextLine();
        String newStr = "";
        for (int i = 0; i < firstStr.length(); i++) {
            char simvol = firstStr.charAt(i);
            if (simvol == '1' || simvol == '2' || simvol == '3' || simvol == '4' || simvol == '5'
                    || simvol == '6' || simvol == '7' || simvol == '8' || simvol == '9' || simvol == '0') {
                simvol = '*';
            }else if (simvol == ' '){
                simvol = ' ';
            }
            newStr += simvol;
        }

        System.out.println("Результат: " + newStr);
    }
}
