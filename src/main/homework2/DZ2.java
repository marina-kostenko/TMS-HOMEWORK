package main.homework2;
//Задание 2.
// Написать программу для вывода в консоль названия поры года по номеру месяца.
//При решении используйте оператор if-else-if.

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a == 3 || a == 4 || a == 5) {
                System.out.println("Весна");
            } else if (a == 6 || a == 7 || a == 8) {
                System.out.println("Лето");
            } else if (a == 9 || a == 10 || a == 11) {
                System.out.println("Осень");
            } else if (a == 12 || a == 1 || a == 2) {
                System.out.println("Зима");
            } else {
                System.out.println("Введите число от 1 до 12");
            }
        }

    }
}


