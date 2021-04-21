//Задача на увеличение каждого элемента трехмерного массива на заданное число


import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[][][] array = {{{1, 2, 3, 5},{3, 5, 11, 84}, {13, 18, 21}}};
        System.out.println("Введите число, на которое хотите увеличить элементы массива");
        Scanner scanner = new Scanner(System.in);
        int increaseNumber = scanner.nextInt();

        for (int[][] item1: array){
            for(int[] item2: item1){
                for(int item3: item2){
                    item3+=increaseNumber;
                    System.out.print(item3 + "\t");
                }
                System.out.println();
            }
        }
    }
}
