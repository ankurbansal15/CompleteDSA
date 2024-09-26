package backtracking;

public class NQueensTotalWaysToArrange {

    public static void main(String[] args) {

        int n = 5;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';

            }
        }

        pattern(board, 0);
        System.out.println("Total number of ways are : "+count);

    }
    
    static int count = 0;
    
    public static void pattern(char[][] board, int row) {

        if (row == board.length) {
            count++;
            return;
        }


        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                pattern(board, row + 1);
                board[row][j] = '.';

            }

        }

    }

    public static boolean isSafe(char[][] board, int row, int col) {

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }

        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void print(char[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");
    }

}
