package dp.knapsack;

public class RodCutting {
    public static void main(String[] args) {
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int totRod = 8;
        System.out.println(rodCutting(length,price,totRod));
    }
    public static int rodCutting(int[] length, int[] price, int totRod){
        int n = length.length;
        int[][] dp = new int[n+1][totRod+1];

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=totRod;j++){
                int l = length[i-1];
                int p = price[i-1];
                if(l <= j){
                    int include = p + dp[i-1][j-l];
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.max(include,exclude);
                }else{
                    int exclude = dp[i-1][j];
                    dp[i][j] = exclude;
                }
            }
        }
        return dp[n][totRod];
    }
}
