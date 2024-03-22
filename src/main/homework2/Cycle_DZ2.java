package main.homework2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Циклы Задание 2. Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа.
public class Cycle_DZ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = sc.nextInt();
        int i = 0;
        for (; a >= 1; a--) {
            i += a;
        }
        System.out.println(i);
    }

}
