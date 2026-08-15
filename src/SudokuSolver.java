public class SudokuSolver {
    private static final int grid_size=9;

    private static boolean isNumberInRow(int[][] board, int num, int row){
        for (int i=0; i<grid_size; i++){
            if (board[row][i]==num) return true;
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int num, int col){
        for (int i=0; i<grid_size; i++){
            if (board[i][col]==num) return true;
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int num, int row, int col){
        int localBoxRow = row-(row%3);
        int localBoxCol=col-(col%3);

        for (int i=localBoxRow; i<localBoxRow+3; i++){
            for (int j=localBoxCol; j<localBoxCol+3; j++){
                if (board[i][j]==num) return true;
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int num, int row, int col){
        return (!isNumberInRow(board, num, row) && !isNumberInColumn(board, num, col) && !isNumberInBox(board, num, row, col));
    }

    public static boolean solveBoard(int[][] board){
        for (int row=0; row<grid_size; row++){
            for (int col=0; col<grid_size; col++){

                if (board[row][col]==0){
                    for (int i=1; i<=grid_size; i++){
                        if (isValidPlacement(board, i, row, col)){
                            board[row][col]=i;
                            if (solveBoard(board)) return true;
                            else board[row][col]=0;
                        }
                    } //try all cases
                    return false;
                }
            }
        }
        return true;
    }
}

