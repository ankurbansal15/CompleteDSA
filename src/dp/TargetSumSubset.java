package dp;

public class TargetSumSubset {
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,3};
        int sum = 10;
        System.out.println(targetSumSubset(arr,sum));

    }
    public static boolean targetSumSubset(int[] arr, int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        //i = items, j = target sum
        for(int i = 0; i<n+1;i++){
            dp[i][0] = true;
        }
        for(int j = 1;j<sum+1;j++){
            dp[0][j] = false;
        }
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<sum+1;j++){
                int value = arr[i-1];
                //include
                if(value <= j && dp[i - 1][j - value]){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void print(boolean[][] dp){
        for(boolean[] i : dp){
            for(boolean j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
