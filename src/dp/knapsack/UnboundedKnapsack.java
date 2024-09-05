package dp.knapsack;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        System.out.println(unboundedKnapsack(val,wt,W));
    }
    //n*w
    public static int unboundedKnapsack(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for(int i = 0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int j = 0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<W+1;j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){
                    int includeProfit = v + dp[i][j-w];
                    int excludeProfit = dp[i-1][j];
                    dp[i][j] = Math.max(includeProfit,excludeProfit);
                }else{
                    int excludeProfit = dp[i-1][j];
                    dp[i][j] = excludeProfit;
                }

            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void print(int[][] dp){
        for(int[] i : dp){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
