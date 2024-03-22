package main.homework2;
//4. Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно».

import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            if (t > -5) {
                System.out.println("Тепло");
            } else if (t > -20) {
                System.out.println("Нормально");
            } else {
                System.out.println("Холодно");
            }
        }
    }
}

