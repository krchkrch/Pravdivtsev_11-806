import java.util.Comparator;

public class GroupCompare implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.group - o2.group;
    }
}
