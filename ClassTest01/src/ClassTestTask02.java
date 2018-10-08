import java.util.Scanner;
public class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        Palindrome(s);
        }
    static void Palindrome(String s){
        int i = s.length()-1;
        int j=0;
        while(i > j) {
            if(s.charAt(i) != s.charAt(j)) {
                System.out.println("Не является");
            }
            i--;
            j++;
        }
        System.out.println("Является");
    }
}

