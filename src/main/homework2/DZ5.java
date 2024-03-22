package main.homework2;
//Задание 5. По введенному из консоли номеру определить цвет радуги (1 –
//красный, 4 – зеленый и т. д.).

import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("красный");
                    break;
                case 2:
                    System.out.println("оранжевый");
                    break;
                case 3:
                    System.out.println("желтый");
                    break;
                case 4:
                    System.out.println("зеленый");
                    break;
                case 5:
                    System.out.println("голубой");
                    break;
                case 6:
                    System.out.println("синий");
                    break;
                case 7:
                    System.out.println("фиолетовый");
                    break;
                default:
                    System.out.println("Введите число от 1 до 7");
            }

        }
    }
}
