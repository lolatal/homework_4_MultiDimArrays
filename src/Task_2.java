//Задача на раскраску шахматной доски

public class Task_2 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard[i].length; j++){
                if(((i%2==1 && j%2==0) || (i%2==0 && j%2==1))){
                    chessBoard[i][j] = "B";
                } else{
                    chessBoard[i][j] = "W";
                }
                System.out.print(chessBoard[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
