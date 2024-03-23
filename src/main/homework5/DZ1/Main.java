package main.homework5.DZ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {


        Figure[] arr = new Figure[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        arr[0] = new Circle(s.nextInt());

        System.out.println("Введите стороны квадрата");
        arr[1] = new Square(s.nextInt());

        System.out.println("Введите стороны прямоугольника");
        arr[2] = new Rectangle(s.nextInt(), s.nextInt());

        System.out.println("Введите стороны квадрата");
        arr[3] = new Square(s.nextInt());

        System.out.println("Введите радиус круга");
        arr[4] = new Circle(s.nextInt());

        double sumPerimetr = 0;

        for (Figure i : arr) {
            sumPerimetr += i.perimetr();

        }

        System.out.println(String.format("%.2f", sumPerimetr));
    }
}