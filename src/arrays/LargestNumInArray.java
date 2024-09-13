package arrays;

public class LargestNumInArray {

    public static void main(String[] args) {

        int[] num = {1, 3, 9, 4, 5, 7};
        System.out.println("The largest number in the array in : " + largestNum(num));

    }
    public static int largestNum(int[] num) {
        int largest = Integer.MIN_VALUE; //-Infinity 
        int smallest = Integer.MAX_VALUE; // +Infinity
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }

            if (smallest > num[i]) {
                smallest = num[i];

            }
        }
        System.out.println("The Smallest number in the array in : " + smallest);

        return largest;

    }

}
