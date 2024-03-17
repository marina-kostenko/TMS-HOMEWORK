package main.homework4.DOP;

public class Computer {
    public int price;
    public String model;
    public RAM ram;
    public HDD hdd;

    Computer(int price, String model)
    {
        this.price = price;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    Computer(int price, String model, String nameRam, int volumeRam, String nameHhd, int volumeHdd, String typeHdd)
    {
        this.price = price;
        this.model = model;
        this.ram = new RAM(nameRam, volumeRam);
        this.hdd = new HDD(nameHhd, volumeHdd, typeHdd);
    }

    public void computerInform()
    {
        System.out.println("Стоимость" + " " + price + " " + "Модель" + " " + model + " " + "RAM" + " " + ram.name + " " + ram.volume + " " + "HDD" + " " + hdd.name + " " + hdd.volume + " " + hdd.type);
    }

}
