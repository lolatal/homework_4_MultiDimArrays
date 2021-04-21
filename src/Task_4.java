//Задача на нахождение суммы всех элементов массива

public class Task_4 {
    public static void main(String[] args) {
        int[][] array = {{5, 7, 10, 13, 15}, {13, 18, 34, 90}};
        int sum = 0;
        for (int[] item1 : array) {
            for (int item2 : item1) {
                sum += item2;
            }
        }
        System.out.println("Сумма всех элементов массива = " + sum);

    }
}
