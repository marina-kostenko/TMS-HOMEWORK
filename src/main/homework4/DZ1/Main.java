package main.homework4.DZ1;

import java.util.Scanner;

//Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.
public class Main {
    public static void main(String[] args)
    {

        CreditCard myCard1 = new CreditCard(1, 10000);
        CreditCard myCard2 = new CreditCard(2, 20000);
        CreditCard myCard3 = new CreditCard(3, 30000);


        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму для зачисления на карту");
        myCard1.debit(s.nextInt());

        System.out.println("Введите сумму для зачисления на карту");
        myCard2.debit(s.nextInt());

        System.out.println("Введите сумму для cнятия с карты");
        int amount = s.nextInt();
        if (amount < myCard3.getCurrentAmount()) {
            myCard3.credit(amount);
        } else {
            System.out.println("Недостаточно средств");
        }
        myCard1.currentInform();
        myCard2.currentInform();
        myCard3.currentInform();

    }
}


