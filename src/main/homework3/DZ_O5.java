package main.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//5. Создайте массив из n случайных (использовать класс Random) целых чисел и выведите его на экран.
//Размер массива задается с консоли и размер массива может быть
//больше 5 и меньше или равно 10.
//Если n не удовлетворяет условию - выведите сообщение об этом.
//Если пользователь ввёл не подходящее число, то программа должна
//просить пользователя повторить ввод.
//Создайте второй массив только из чётных элементов первого массива,
//если они там есть, и вывести его на экран.
public class DZ_O5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива >5 и <=10");

        int length = s.nextInt();  //присваиваем введенное значение переменной length
        while (length <= 5 || length > 10) { //пока значение не будет соответсовать диапозону:
            System.out.println("Неверное число.Введите размер массива >5 и <=10");
            length = s.nextInt();    //будем вводить и присваивать новое значение переменной length
        }
        int[] arr = new int[length];          //если введеное значение подходит, то оно присваивается длине массива
        // System.out.println("Длина массива" + arr.length);

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));

        int newLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i] % 2;
            if (a == 0) {
                newLength++;
            }
        }
        //System.out.println(newLength);

        int[] arr2 = new int[newLength];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[j] = arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }

}
