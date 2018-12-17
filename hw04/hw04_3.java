import java.util.Scanner;


public class hw04_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strResult = "";
        String str = sc.next();
        char[] chars = str.toCharArray();

        int start = sc.nextInt();
        int finish = sc.nextInt();

        for (int i = 0; i < chars.length; i++) {
            if (i < start || i > finish) {
                strResult += chars[i];
            }
        }

        System.out.println(strResult);
    }
}
