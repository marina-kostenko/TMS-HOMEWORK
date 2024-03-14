package main.homework3;

import java.util.Random;
import java.util.Scanner;

//2. Создайте двухмерный массив из n * m случайных (использовать класс Random)
// целых чисел, где n и m вводятся пользователем с консоли.
//Выведите на консоль сумму всех элементов массива.
public class DZ_M2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов в массиве");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];

        /*
         System.out.println("Строк : " + arr.length);
         System.out.println("Колонок : " + arr[0].length);
        */

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = r.nextInt(20);
                if (arr[i][j] > 9) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + "  ");
                }
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма = " + sum);
    }
}

