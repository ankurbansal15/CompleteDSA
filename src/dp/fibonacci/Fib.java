package dp.fibonacci;

public class Fib {
    public static void main(String[] args) { //O(n)
        int n = 6;
        int[] dp = new int[n+1]; //0,0,0,0
        System.out.println(fib(n,dp));
        System.out.println(fibTabulation(n));
    }
    public static int fibTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
           dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static int fib(int n,int[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){ //fib(n) is already calculated
           return dp[n];
        }
        return dp[n] = fib(n - 1,dp) + fib(n - 2,dp);
    }
}
