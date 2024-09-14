package arrays;

public class StaircaseSearchSortedArray {

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int key = 40;
        staircaseSearchBottomLeft(matrix, key);
        staircaseSearchRightUpper(matrix, key);

    }

    // we are starting search from "Right Upper Corner"
    public static void staircaseSearchRightUpper(int[][] matrix, int key) {

        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.print("Key found at (" + row + "," + col + ")");
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.print("Key is not present in MATRIX");

    }

    // We are starting search from "Bottom Left Corner"
    public static void staircaseSearchBottomLeft(int[][] matrix, int key) {

        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {

            if (key == matrix[row][col]) {
                System.out.print("Key found at (" + row + "," + col + ")");
                return;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }

        System.out.print("Key not found !");
    }

}
