import java.util.Scanner;

public class hw06_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s =  sc.nextLine();
        System.out.println(ltrim(s));
    }
    static String ltrim(String s){
        String changedS = "";
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol != ' '){
                changedS += symbol;
            }
        }
        return changedS;
    }
}
