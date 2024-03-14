package main.homework4.DZ1;

//Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.
public class Main
{
    public static void main(String[] args)
    {

        CreditCard myCard1 = new CreditCard(1, 10000);
        CreditCard myCard2 = new CreditCard(2, 20000);
        CreditCard myCard3 = new CreditCard(3, 30000);

        myCard1.debit();
        myCard2.debit();
        myCard3.credit();

        myCard1.currentInform();
        myCard2.currentInform();
        myCard3.currentInform();

    }
}
