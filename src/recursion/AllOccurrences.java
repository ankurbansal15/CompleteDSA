package recursion;

public class AllOccurrences {

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        occurrences(arr, 0, 2);

    }

    public static void occurrences(int[] arr, int i, int key) {

        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        occurrences(arr, i + 1, key);

    }

}
