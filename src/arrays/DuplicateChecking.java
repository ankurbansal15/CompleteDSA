package arrays;

public class DuplicateChecking {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4,1,6,7,8,9};
        System.out.println(duplicateChecking(nums));

    }
    public static boolean duplicateChecking(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
