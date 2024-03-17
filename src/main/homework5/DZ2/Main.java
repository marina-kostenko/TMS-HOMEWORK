package main.homework5.DZ2;

public class Main {
    public static void main(String[] args)
    {
        Director d = new Director();
        d.displayJobTitle();

        Accountant a = new Accountant();
        a.displayJobTitle();

        Worker w = new Worker();
        w.displayJobTitle();
    }
}
