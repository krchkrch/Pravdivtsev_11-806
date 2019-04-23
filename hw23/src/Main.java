public class Main {
    public static void main(String[] args) {
        Students Ilya = new Students("Ilya", "Pravdivtsev", 806);
        Students Ivan = new Students(new String("Ilya"), new String("Ivanov"), 806);
        if (Ilya.equals(Ivan) && Ilya.hashCode() == Ivan.hashCode())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
