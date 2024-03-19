package main.homework4.DOP;

public class RAM {
    public String name;
    public int volume;

    RAM()
    {
    }

    RAM(String name, int volume)
    {
        this.name = name;
        this.volume = volume;
    }

    public void ramInform()
    {
        System.out.println("Название" + " " + name + " " + "Объем" + " " + volume);
    }
}
