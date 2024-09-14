package arrays;

public class MatrixSumDiagonal {

    // Solution by brute Force approach
    //time complexity = O(n)

    public static void sumDiagonal(int[][] matrix) {

        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == j) {
                    sum += matrix[i][j];
                }

                if (i + j == n - 1) {
                    if (i == j) {
                        continue;
                    }
                    sum += matrix[i][j];

                }

            }
        }

        System.out.println(sum);

    }


    public static void sumDiagonal2(int[][] matrix) {

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // for prime diagonal
            sum += matrix[i][i];

            // for secondary diagonal
            // we can j = n-1-i
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }

        }

        System.out.println(sum);
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        sumDiagonal(matrix);
    }

}
