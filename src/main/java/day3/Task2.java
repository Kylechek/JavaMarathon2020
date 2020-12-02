package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double numberOne = sc.nextDouble();
            double numberTwo = sc.nextDouble();
            double result = numberOne / numberTwo;
            if (numberTwo == 0) {
                break;
            }
            System.out.println(result);
        }
    }
}
