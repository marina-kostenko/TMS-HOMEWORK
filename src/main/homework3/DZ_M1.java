package main.homework3;

//1. Шахматная доска
//Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двухмерный массив String'ов 8х8. С помощью циклов задать элементам
//циклам значения B(Black) или W(White). Результат работы программы:
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
public class DZ_M1 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

}
