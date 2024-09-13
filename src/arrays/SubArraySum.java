package arrays;

public class SubArraySum {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        int n = num.length;
        System.out.println("Total number of SubArrays is " + (n * (n + 1)) / 2);

        subArraySum(num);
    }

    public static void subArraySum(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += num[k];
                }
                System.out.println("Sum of Subarray " + ++count + " is " + sum);
            }
        }
    }

}
