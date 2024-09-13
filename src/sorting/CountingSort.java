package sorting;

public class CountingSort {

    public static void main(String[] args) {

        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void countingSort(int[] arr) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            largest = Math.max(largest, arr[i]);

        }

        //making count/frequency array
        int[] count = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {

            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                //adding element to the original array
                arr[j] = i;
                //if repeated then adding again until the count became zero
                count[i]--;
                //increasing the index so to element in next box of array
                j++;
            }

        }
    }
}
