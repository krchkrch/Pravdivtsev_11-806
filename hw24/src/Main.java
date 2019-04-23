import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Group group806 = new Group(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.group - o2.group;
            }
        });
        Students s1 = new Students("Ilya", "Pravdivtsev", 806);
        Students s2 = new Students("Nikita", "Chernigov", 806);
        Students s3 = new Students("Bulat", "Khaziev", 806);
        Students s4 = new Students("Nikita", "Petrov", 806);
        Students s5 = new Students("Igor", "Chernigov", 806);
        group806.add(s2);
        group806.add(s5);
        group806.add(s4);
        group806.add(s3);
        group806.add(s1);

        group806.printStudents();
        System.out.println();

        Group group807 = new Group(((o1, o2) -> o1.name.compareTo(o2.name)));
        group807.add(s1);
        group807.add(s2);
        group807.add(s3);
        group807.add(s4);
        group807.add(s5);

        group807.printStudents();
    }
}
