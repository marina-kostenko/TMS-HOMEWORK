package main.homework4.DZ1;
//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую
//сумму.
//Добавьте метод, который выводит текущую информацию о карточке (номер счета, текущая сумма на счету).

import java.util.Scanner;

public class CreditCard
{
    int account;
    int currentAmount;

    CreditCard(int account, int currentAmount)
    {
        this.account = account;
        this.currentAmount = currentAmount;
    }

    void debit()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму для зачисления на карту");
        currentAmount += s.nextInt();
    }

    void credit()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму для снятия с карты");
        currentAmount -= s.nextInt();
    }
    void currentInform()
    {
        System.out.println(account + " " + currentAmount);
    }
}
