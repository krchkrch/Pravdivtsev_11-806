import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 1;
        Map<String, Integer> map = new SimpleMap<>(1);
        Scanner in = new Scanner(new File("in.txt"));
        while(in.hasNext()){
            String str = in.next();
            str = str.replaceAll("\\.","");
            str = str.replaceAll("\\,","");
            if(map.get(str) == null)
                map.put(str, i++);
            else
            map.put(str, map.get(str)+1);
        }
        in.close();
        map.printMap();
    }
}
