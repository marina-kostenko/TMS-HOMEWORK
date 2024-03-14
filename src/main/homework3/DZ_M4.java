package main.homework3;
//4. Создайте двухмерный массив из n * m случайных (использовать класс Random) целых чисел,
// где n и m вводятся пользователем с консоли.
// Отсортируйте элементы в строкахдвумерного массива по возрастанию.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ_M4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов массива");
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = r.nextInt(20);
                if ((arr[i][j]) > 9) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + "  ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((arr[i][j]) > 9) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + "  ");
                }
            }
            System.out.println();
        }

    }
}