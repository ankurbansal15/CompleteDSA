package arrays;

public class MaxSubArraySumPrefixSum {

    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4, 5 };

        prefixArray(num);

    }
    public static void prefixArray(int[] num) {

        int currSum;
        int maxSum = Integer.MIN_VALUE;


        int[] prefix = new int[num.length];
        prefix[0] = num[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {

                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Max sum of a sub Array is : " + maxSum);

    }

}
