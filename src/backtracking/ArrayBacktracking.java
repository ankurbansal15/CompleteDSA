package backtracking;

public class ArrayBacktracking {

    public static void main(String[] args) {

        int[] arr = new int[5];

        work(0, arr, 1);
        System.out.println();

        printArray(arr);
    }

    public static void work(int i, int[] arr, int val) {

        if (i == arr.length) {
            printArray(arr);
            return;
        }

        arr[i] = val;
        work(i + 1, arr, val + 1);

        arr[i] = arr[i] - 2;


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
