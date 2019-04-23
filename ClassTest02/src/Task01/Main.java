package Task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(new File("words.txt"));
        while(in.hasNext()){
            String str = in.next();
            if(map.get(str) == null)
                map.put(str, 1);
            else
                map.put(str, map.get(str) + 1);
        }
        in.close();

        Map<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(result);
    }
}