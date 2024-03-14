package main.homework3;
//4. Создайте 2 массива из 5 чисел.
//Заполнять массивы можно произвольным образом (с консоли или с использованием класса Random).
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//выведите на консоль, для какого из массивов это значение
// оказалось больше (либо выведите, что их средние арифметические равны).


import java.util.Arrays;
import java.util.Scanner;

public class DZ_O4 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 5 чисел для первого массива");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Введите 5 чисел для второго массива");

        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        double average1 = (double) sum1 / arr1.length;
        double average2 = (double) sum2 / arr2.length;

        if (average1 > average2) {
            System.out.println("Среднее арифметическое массива arr1 больше");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое массива arr2 больше");
        } else {
            System.out.println("Среднее арифметическое массива arr1 и arr2 равны");
        }
    }
}
