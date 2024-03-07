package main.homework1;

import java.util.Scanner;

public class DZ2 {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите первый множитель");
        int num1 = ss.nextInt();
        System.out.println("Введите второй множитель");
        int num2 = ss.nextInt();
        System.out.println("Введите третий множитель");
        int num3 = ss.nextInt();
        int result = num1 * num2 * num3;
        System.out.println("Результат умножения " + result);

    }
}
