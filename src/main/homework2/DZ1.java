package main.homework2;

//Задание 1. Написать программу для вывода в консоль названия поры года по номеру месяца.
//При решении используйте оператор switch-case.


import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            switch (a) {
                case 12:
                case 1:
                case 2:
                    System.out.println("зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("Введите число от 1 до 12");
            }
        }

    }
}






