//Задача на отсортировку элементов в строках двумерного массива
//Если заполнять массив целыми числами через Random, то отрабатывает неправильно.
//Также, если выводить через цикл foreach тоже отрабатывает неправильно

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        array[0][0] = 33;
        array[0][1] = 21;
        array[0][2] = 88;
        array[0][3] = 4;

        array[1][0] = 91;
        array[1][1] = 5;
        array[1][2] = 12;
        array[1][3] = 81;

        array[2][0] = 12;
        array[2][1] = 31;
        array[2][2] = 24;
        array[2][3] = 8;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Arrays.sort(array[i]);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
