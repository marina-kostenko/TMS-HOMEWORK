package main.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//1. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Число для поиска задается с консоли (класс Scanner).
//Заполнять массив можно произвольным образом (с консоли или с использованием класса Random).
public class DZ_O1 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {   //заполняем массив рандомными числами от 0 до 10
            arr[i] = r.nextInt(10);
        }
        System.out.print(Arrays.toString(arr)); //выводим массив на экран

        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число для поиска в массиве от 0 до 10");
        while (s.hasNextInt()) {
            int a = s.nextInt();            //задаем число для поиска в массиве
            boolean result = false;          //объявлем переменную result с начальным значением false
            for (int j = 0; j < arr.length; ) {

                if (a == arr[j]) {              //если заданное число совпало с нулевой ячейкой
                    result = true;              //то присваиваем перем.result значение true
                    break;                      //завершаем цикл
                } else j++;                     //иначе переходим к следующей ячейке для сравнения
            }
            if (result)                         //если переменной присвоилось значение true:
                System.out.println("Данное число присутствует в массиве");
            else
                System.out.println("Данное число отсутствует в массиве");

            System.out.println("Введите число для поиска в массиве от 0 до 10");
        }
    }
}







