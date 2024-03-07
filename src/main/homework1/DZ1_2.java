package main.homework1;

import java.util.Scanner;

public class DZ1_2 {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите делимое");
        int num1 = ss.nextInt();

        System.out.println("Введите делитель");
        int num2 = ss.nextInt();

        int num3 = num1 % num2;

        System.out.println("Остаток от деления равен " + num3);
    }
}
