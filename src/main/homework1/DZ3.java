package main.homework1;

import java.util.Scanner;

public class DZ3 {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = ss.nextInt();
        System.out.println("Введите второе число");
        int num2 = ss.nextInt();

        boolean result = num1 == num2;
        System.out.println(result); // лучше не создавать boolean и написать System.out.println(num1 == num2);
    }
}
