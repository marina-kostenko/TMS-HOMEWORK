package main.homework8;

public class Main {
    public static void main(String[] args)
    {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(375447607583l, "samsung");
        Phone phone3 = new Phone(375447607580l, "xiaomi", 640);

        phone1.receiveCall("Алексей");
        phone1.getNumber();
        //phone1.sendMessage(375447607583l,375447607580l);

        phone2.receiveCall("Ольга");
        phone2.getNumber();

        phone3.receiveCall("Сергей");
        phone3.getNumber();

        phone2.receiveCall("Марина", phone2.getNumber());

    }
}
