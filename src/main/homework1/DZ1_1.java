package main.homework1;

import java.util.Scanner;

public class DZ1_1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = ss.nextInt();

        System.out.println("Введите второе число");
        int num2 = ss.nextInt();

        int num3 = num1 / num2;

        System.out.println("Результат деления равен " + num3);
    }
}
