package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            double numberOne = sc.nextDouble();
            double numberTwo = sc.nextDouble();
            double result = numberOne / numberTwo;
            if (numberTwo == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(result);
        }
    }
}
