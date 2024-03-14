package main.homework4.DOP;

public class RAM
{
    String name;
    int volume;

    RAM()
    {
    }

    RAM(String name, int volume)
    {
        this.name = name;
        this.volume = volume;
    }

    void ramInform()
    {
        System.out.println("Название" + " " + name + " " + "Объем" + " " + volume);
    }
}
