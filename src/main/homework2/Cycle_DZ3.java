package main.homework2;

//Циклы Задание 3. Необходимо, чтоб программа выводила в консоль вот такую
//последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//В решении используйте цикл while.
public class Cycle_DZ3 {
    public static void main(String[] args) {
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }
    }
}
