//Задача на вывод диагоналей двумерного массива

import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(100);
                if(i==j || j== array.length - i - 1){
                    System.out.print(array[i][j] + " ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }

    }
}
