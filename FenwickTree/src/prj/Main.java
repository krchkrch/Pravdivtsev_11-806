package prj;

import prj.DataGenerate.DataGenerator;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void add(int[] t, int i, int value) {
        for (; i < t.length; i |= i + 1)
            t[i] += value;
    }

    public static int sum(int[] t, int i) {
        int res = 0;
        for (; i >= 0; i = (i & (i + 1)) - 1)
            res += t[i];
        return res;
    }

    public static int sum(int[] t, int a, int b) {
        return sum(t, b) - sum(t, a - 1);
    }


    public static void main(String[] args) throws IOException {

        DataGenerator g = new DataGenerator();
        Scanner svc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве");
        int n = svc.nextInt();
        g.generate(n);
        File data = new File("data.txt");
        Scanner sc = new Scanner(data);
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            if (sc.hasNextInt())
                add(t, i, sc.nextInt());

        }
        //summa s 1 po 3 index elementov
        int a = sum(t,1,3);
        //dobavlenie chisla 3 k elementu s indexom 1
        add(t,1,3);
        System.out.println(a);

        for (int z = 0; z < t.length; z++) {
            System.out.print(t[z]+" ");

        }
    }
}


