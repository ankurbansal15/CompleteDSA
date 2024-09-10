package dp.grid;

import java.util.Arrays;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int n = arr.length;
        System.out.println(mcm(arr,1,n-1));
        int[][] dp = new int[n][n];
        for(int i = 0;i<n;i++){
              Arrays.fill(dp[i],-1);
        }
        System.out.println(mcmMemo(arr,1,n-1,dp));
        System.out.println(mcmTab(arr));


    }
    public static long mcmTab(int[] arr) {
        int n = arr.length;
        long[][] dp = new long[n][n];

        for (int len = 2; len <= n - 1; len++) {
            for (int i = 1; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Long.MAX_VALUE;

                for (int k = i; k <= j-1; k++) {
                    long cost1 = dp[i][k];
                    long cost2 = dp[k + 1][j];
                    long cost3 = (long) arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
                }
            }
        }
        print(dp);
        return dp[1][n - 1];
    }

    public static void print(long[][] array){
        for(long[] i : array){
            for(long j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static int mcmMemo(int[] arr,int i,int j, int[][] dp){
       if(i==j){
           return 0;
       }
       if(dp[i][j] != -1){
           return dp[i][j];
       }
       int ans = Integer.MAX_VALUE;
       for(int k = i;k<=j-1;k++){
           int cost1 = mcmMemo(arr,i,k,dp);
           int cost2 = mcmMemo(arr,k+1,j,dp);
           int cost3 = arr[i-1] * arr[k] * arr[j];
           int finalCost = cost1 + cost2 + cost3;
           ans = Math.min(ans,finalCost);
        }
       return dp[i][j] = ans;
    }
    public static int mcm(int[] arr, int i, int j){
        if(i==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i;k<=j-1;k++){
            int cost1 = mcm(arr,i,k); //Ai...Ak => arr[i+1] X arr[k]
            int cost2 = mcm(arr,k+1,j);//Ai+1...Aj => arr[k] X arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans,finalCost);

        }
        return ans;
    }

}
