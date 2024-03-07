package main.homework2;

import java.util.Scanner;

//2.
// За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//Напишите программу, которая вычисляет конечную сумму вклада с учетом
//начисления процентов за каждый месяц.
//Сумму вклада и количество месяцев пользователь вводит с консоли.
//
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть
//сумма вклада будет представлять тип float.
public class DOP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float deposit = sc.nextFloat();
        System.out.println("Введите количество месяцев");
        int month = sc.nextInt();
        float finalDeposit = deposit;
        for (; month > 0; month--) {
            finalDeposit += finalDeposit * 7 / 100f;
        }
        System.out.println(finalDeposit);
    }
}


