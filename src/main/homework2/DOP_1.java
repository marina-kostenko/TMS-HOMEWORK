package main.homework2;

import java.util.Scanner;

// Выведите в консоль первые N членов
// последовательности Фибоначчи (где N- количество членов, вводимое пользователем из консоли).
public class DOP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i=1; i <= n; i++) {
                        int c = a + b;
            System.out.print(c + " ");
            b = a;
            a = c;
        }
    }
}

