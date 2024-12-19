package dp.lcs;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {50,3,10,7,40,80};
        System.out.println(longestIncreasingSubsequence(arr));

    }

    private static int longestIncreasingSubsequence(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] arr2 = new int[arr.length];
        int idx = 0;
        for(int num : set){
            arr2[idx++] = num;
        }
        return longestCommonSubsequence(arr,arr2);

    }
    private static int longestCommonSubsequence(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[][] dp = new int[n+1][m+1];
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<m+1;j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
}
