package main.homework4.DZ1;
//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую
//сумму.
//Добавьте метод, который выводит текущую информацию о карточке (номер счета, текущая сумма на счету).

import java.util.Scanner;

public class CreditCard {
    private int account;
    private int currentAmount;

    public int getCurrentAmount()
    {
        return currentAmount;
    }

    CreditCard(int account, int currentAmount)
    {
        this.account = account;
        this.currentAmount = currentAmount;
    }

    public void debit(int currentAmount)
    {
        this.currentAmount += currentAmount;
    }

    public String credit(int currentAmount)
    {
        if (currentAmount <= this.currentAmount) {
            this.currentAmount -= currentAmount;
            return "Списание произведено";
        } else {
            return "Недостаточно средств";
        }

    }

    public void currentInform()
    {
        System.out.println(account + " " + currentAmount);
    }
}
