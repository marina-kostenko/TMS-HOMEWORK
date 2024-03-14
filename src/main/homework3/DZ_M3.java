package main.homework3;

import java.util.Random;
import java.util.Scanner;

//3. Создайте двухмерный массив из n * m случайных (использовать класс Random) целых чисел,
// где n и m вводятся пользователем с консоли.
//Выведите на консоль диагонали массива.
public class DZ_M3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов в массиве");
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr = new int[n][m];

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
        System.out.print("Диагональ массива = ");
        int k = n <= m ? n : m;
        for (int i = 0; i < k; i++) {
            int d = arr[i][i];                  // диагональ
            System.out.print(d + " ");
        }
    }
}


