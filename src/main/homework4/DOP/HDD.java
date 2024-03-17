package main.homework4.DOP;

public class HDD {
    public String name;
    public int volume;
    public String type;

    HDD()
    {
    }

    HDD(String name, int volume, String type)
    {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void hddInform()
    {
        System.out.println("Название" + " " + name + " " + "Объем" + volume + " " + "Тип" + " " + type);
    }
}
