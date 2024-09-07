package dp.catalans_number;

public class CountBSTs {
    public static void main(String[] args) {
        System.out.println(countBST(4));
    }
    public static long countBST(int n){
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<n+1;i++){
            for(int j = 0;j<i;j++){
                long left = dp[j];
                long right = dp[i-j-1];
                dp[i] += left * right;
            }
        }
        return dp[n];
    }
}
