package main.homework4.DOP;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Main
{
    public static void main(String[] args)
    {
        Computer computer1 = new Computer(20000, "samsung");
        computer1.computerInform();

        Computer computer2 = new Computer(30000, "HP", "ddr3", 16, "seagate", 500, "внутренний");
        computer2.computerInform();

    }
}
