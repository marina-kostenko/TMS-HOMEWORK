package main.homework4.DOP;

public class HDD
{
    String name;
    int volume;
    String type;

    HDD()
    {
    }

    HDD(String name, int volume, String type)
    {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    void hddInform()
    {
        System.out.println("Название" + " " + name + " " + "Объем" + volume + " " + "Тип" + " " + type);
    }
}
