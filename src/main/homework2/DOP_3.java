package main.homework2;

//3. Напишите программу, которая выводит на консоль таблицу
//умножения.
public class DOP_3 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j < 10)
                    System.out.print(" " + i * j + " ");
                else
                    System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
