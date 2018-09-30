import java.util.Scanner;

public class hw07_D {

    public static int check(double a) {
        if (a==1){
            return 1;
        }
        else if(a>1&&a<2) {
            return 0;
        }
        else {
            return check(a/2);
        }
    }
public static void main(String[] args) {
    System.out.println("Введите число: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (check(a)==1) {
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }
}
}
