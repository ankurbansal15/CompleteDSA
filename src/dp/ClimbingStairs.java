package dp;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
         int n = 5; //n = 3 -> 3 & n = 4 -> 5 => 8
         int[] dp = new int[n+1]; //Store ways
        Arrays.fill(dp,-1);
        System.out.println(countWays(n,dp));


    }
    //memoization - O(n) | Recursion - O(2^n)
    public static int countWays(int n,int[] dp){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){ //already calculated
            return dp[n];
        }
        return dp[n] = countWays(n - 1,dp) + countWays(n - 2,dp);
    }
    //O(n)
    public static int countWaysTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;

        //tabulation loop
        for(int i = 1;i<=n;i++){
            if(i==1){
               dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }

}
