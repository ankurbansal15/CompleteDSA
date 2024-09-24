package recursion;

public class IsArraySorted {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        System.out.print(isSorted(arr, i));

    }

    public static boolean isSorted(int[] arr, int i) {

        if (arr[i] <= arr[arr.length - 1]) {
            return true;
        }


        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);

    }

}
