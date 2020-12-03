package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + " ");
        }

        int min = array[0];
        int max = array[0];
        int count = 0;
        int number = 0;
        System.out.println(min);
        for (int x = 0; x < array.length; x++) {
            if (array[x] < min) {
                min = array[x];
            }
            if (array[x] > max) {
                max = array[x];
            }
            if (array[x] % 10 == 0) {
                number = array[x]++;
                count++;
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("Количество элементов массива, оканчивающихся на 0\n" + count);
        System.out.println("сумму элементов массива, оканчивающихся на 0\n" + number);
    }
}