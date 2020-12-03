package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        int sum = 0;

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 5; b++) {
                array[a][b] = (int) (Math.random() * 50);
                System.out.print(" " + array[a][b] + " ");
            }

        }
        int[] resultSum = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 5; x++) {
                sum = sum + array[i][x];
            }
            resultSum[i] = sum;
            System.out.println(resultSum[0]);
            System.out.println(resultSum[1]);
            System.out.println(resultSum[2]);
            sum = 0;
        }
        int max = 0;
        int count = 0;
        for (int y = 0; y < resultSum.length; y++) {
            if (resultSum[y] > max) {
                max = resultSum[y];
                count ++;
            }
        }
        System.out.println(count);
    }
}