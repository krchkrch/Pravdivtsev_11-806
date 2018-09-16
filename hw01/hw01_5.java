import java.util.Scanner;

public class hw01_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int n = sc.nextInt();
        int sum=0;
       while(n>0) {
           sum+=(n%10);
           n/=10;
        }


        System.out.println(sum);
    }
}