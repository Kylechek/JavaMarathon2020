package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int sum = 0;

        for (int i : array) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] > 8) {
                countOne++;
            }
            if (array[i] % 2 == 0) {
                countTwo++;
            } else {
                countThree++;
            }
            sum++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Информация о массиве:" + "\n" +
                "Длина массива:" + array.length);
        System.out.println("Количество чисел больше 8: " + countOne);
        System.out.println("Количество чисел равных 1: " + Arrays.binarySearch(array, 1));
        System.out.println("Количество четных чисел: " + countTwo);
        System.out.println("Количество четных чисел: " + countThree);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}