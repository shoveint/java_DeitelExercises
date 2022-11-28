package Chapter8;

public class TicTacToe {
    private TicTacToeConstant[][] board = new TicTacToeConstant[3][3];

    public TicTacToe (){
        int row = 0;
        while (row < board.length){
            int column = 0;
            while (column < board[row].length){
                board[row][column] = TicTacToeConstant.EMPTY;
                column++;
            }
            row++;
        }
    }
}
