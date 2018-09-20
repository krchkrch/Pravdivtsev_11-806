import java.util.Scanner;


public class hw03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во студентов: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Введите по очереди рост каждого студента в сантиметрах:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double avg = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            avg = sum / arr.length;
        }
        int count = 0;
        for (int k = 0; k < n; k++)
            if (arr[k] > avg) {
                count += 1;
            }
        System.out.println("Средний рост студентов: " + avg + " см");
        System.out.println("Количество студентов с ростом выше среднего: " + count);
    }


}



