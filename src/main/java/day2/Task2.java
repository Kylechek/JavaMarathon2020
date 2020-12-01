package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; a <= b; i++) {
            a = i + 1;
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
