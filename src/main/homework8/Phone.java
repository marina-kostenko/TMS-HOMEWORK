package main.homework8;

public class Phone {

    private long number;
    private String model;
    private int weight;

    public Phone()
    {

    }

    public Phone(long number, String model, int weight)
    {
        this(number, model);
        this.weight = weight;

    }

    public Phone(long number, String model)
    {
        this.number = number;
        this.model = model;

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

    public void setNumber(long number)
    {
        this.number = number;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }
}