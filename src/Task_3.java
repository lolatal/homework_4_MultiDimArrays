public class Task_3 {

    //матрица 1 = a*b (где а  -строки, b - столбцы)
    //матрица 2 = b*a
    //результат перемножения двух матриц дает в новой матрице
    // кол-во строк = кол-ву столбоцов матрицы 2
    // кол-во столбоцов = кол-ву строк в матрице 1
    // таким образом, матрица 3 = a*a

    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int a = array1.length;
        int b = array2[0].length;

        int[][] multipliedMatrix = new int[a][a];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                for(int k = 0; k < a; k++){
                    multipliedMatrix[i][j]+=array1[i][k]*array2[k][j];
                }
            }
        }
        System.out.println("Результат перемножения двух матриц: ");
        for (int[] item1 : multipliedMatrix) {
            for (int item2 : item1) {
                System.out.print(item2 + " ");
            }
            System.out.println();
        }

    }
}
