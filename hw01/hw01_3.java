import java.util.Scanner;

public class hw01_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int n = sc.nextInt();
        long fact = 1;
        while (n>1){
            fact*=n;
            n--;
        }



        System.out.println(fact);
}
}