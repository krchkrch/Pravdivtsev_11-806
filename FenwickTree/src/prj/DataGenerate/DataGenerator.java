package prj.DataGenerate;

import java.io.*;

public class DataGenerator {


    public static void generate(int n) throws IOException {
        File data = new File("data.txt");
        FileWriter fr = new FileWriter(data);
        BufferedWriter bw = new BufferedWriter(fr);
        for (int i = 0; i < n; i++) {
            bw.write(((int) Math.round(Math.random() * 100)) +"\n");
        }
        bw.close();
        fr.close();
    }
}
