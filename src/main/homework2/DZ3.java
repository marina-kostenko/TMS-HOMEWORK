package main.homework2;

import java.util.Scanner;

//Задание 3. Напишите программу, которая будет принимать на вход (ввод из консоли) число
// и в консоль будет выводить сообщение четное число или нет.
public class DZ3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Четное число");
            } else {
                System.out.println("Нечетное число");
            }
        }

    }
}
