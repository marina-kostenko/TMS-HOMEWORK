package main.homework2;

//Циклы Задание 4. Составьте программу, выводящую в консоль квадраты чисел от 10 до
//20 включительно.
public class Cycle_DZ4 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 10; i <= 20; i++) {
            a = i * i;
            System.out.print(a + " ");
        }
    }
}
