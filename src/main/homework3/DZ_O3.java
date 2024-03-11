package main.homework3;

import java.util.Arrays;
import java.util.Scanner;

//3. Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера
// (размер массива вводится с консоли).
public class DZ_O3 {
    public static void main(String[] args) {

        System.out.println("Введите размер массива");
        Scanner s = new Scanner(System.in);
        int[] arr = new int[s.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20); //случайные целые числа от 0 о 20
        }
        System.out.println(Arrays.toString(arr)); //выводим массив на экран

        int max = arr[0]; // присваиваем переменной max значение нулевой ячейки (предположим что оно максимальное в массиве)
        int min = arr[0]; //присваиваем переменной min значение нулевой ячейки
        for (int i = 1; i < arr.length; i++) { //начинаем сравнивать с первой ячейки
            if (arr[i] > max) {           //если значение следующей ячейки больше предыдущей
                max = arr[i];            // присваиваем переменной max значение этой ячейки
                //переходим к следующей ячейке i++ и заново сравниваем
            }
            if (arr[i] < min) {             //если значение  меньше предыдущего
                min = arr[i];                   //присваиваем переменной min значение этой ячейки
            }
        }
        System.out.println("Максимальное значение массива " + max);
        System.out.println("Минимальное значение в массиве " + min);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Среднее значение равно " + (double) sum / arr.length);
    }


}
