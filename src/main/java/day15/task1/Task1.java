package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\resources\\shoes.csv");
        File file1 = new File("src\\main\\resources\\missing_shoes.txt");
        Scanner sc = new Scanner(file);
        PrintWriter pw = new PrintWriter(file1);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] text = line.split(";");
            if (text[2].equals("0")) {
                pw.println(Arrays.toString(text));
            }
        }
        sc.close();
        pw.close();
    }
}
