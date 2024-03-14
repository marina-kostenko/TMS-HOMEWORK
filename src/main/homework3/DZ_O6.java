package main.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//6. Создайте массив из n случайных (использовать класс Random) целых чисел.
// Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.
public class DZ_O6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int[] arr = new int[s.nextInt()];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);

        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i = i + 2) {
            arr[i] = 0;

        }
        System.out.println(Arrays.toString(arr));
    }
}
