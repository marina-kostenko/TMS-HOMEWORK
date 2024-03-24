package main.homework8;

public class Phone {

    private long number;
    protected String model;
    protected int weight;

    Phone(long number, String model, int weight)
    {
        this(number, model);
        this.weight = weight;

    }

    Phone(long number, String model)
    {
        this.number = number;
        this.model = model;

    }

    Phone()
    {

    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long number)
    {
        System.out.println("Звонит " + name + " номер: " + number);
    }

    public long getNumber()
    {
        return number;
    }

    public void sendMessage(long... number)
    {
        for (long i : number) {
            System.out.println("Сообщение отправлено: " + i);
        }

    }
}