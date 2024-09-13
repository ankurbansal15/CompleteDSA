package arrays;

public class MaxSubArraySumBruteForce {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        maxSubArraySum(num);

    }

    public static void maxSubArraySum(int[] num) {

        int currentSum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            for (int j = i; j < num.length; j++) {

                currentSum = 0;

                for (int k = i; k <= j; k++) {
                    currentSum += num[k];
                }

                // Comparing current sum and max sum 
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

            }
        }
        System.out.println("Max sum of an array is : " + maxSum);
    }

}
