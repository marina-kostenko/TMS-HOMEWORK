package main.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//2. Создайте массив целых чисел. Удалите все вхождения заданного
//числа из массива.
//Заполнять массив можно произвольным образом (с консоли или с использованием класса Random).
//Число задается с консоли (класс Scanner). Если такого числа нет -
//выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.
public class DZ_O2 {
    public static void main(String[] args) {
        //создаем и заполняем массив произвольными значениями
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));

        //проверяем наличие числа в массиве для понимания какой длины будет новый массив
        System.out.println("Введите число от 1 до 20 для удаления из массива");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int newLengthArr2 = 0;//новая длина будущего массива
        for (int j = 0; j < arr.length; j++) {
            if (a != arr[j]) {
                newLengthArr2++; //увеличиваем для понимания размера длины нового массива
            }
        }
        //Если совпадений не найдено - завершаем работу
        if (newLengthArr2 == arr.length) {
            System.out.println("Нет элемента в массиве");
            return;
        }
        // создаем новый массив с новой длиной и заполняем его
        int[] arr2 = new int[newLengthArr2];
        for (int k = 0, n = 0; k < arr.length; k++) {
            if (a != arr[k]) {      //если введенное число не равно элементу изначального масива arr
                arr2[n] = arr[k]; //записываем в новый массив число из массива arr
                n++; //переходим к следующему элементу нового массива arr2
            }
        }
        System.out.println(Arrays.toString(arr2));


    }
}