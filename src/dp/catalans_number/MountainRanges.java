package dp.catalans_number;

public class MountainRanges {
    public static void main(String[] args) {
        System.out.println(mountainRanges(4));
    }
    //O(n^2)
    public static long mountainRanges(int n){
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<n+1;i++){
            //i pairs -> mountain ranges => Ci
            for(int j = 0;j<i;j++){
                long inside = dp[j];
                long outside = dp[i-j-1];
                dp[i] += inside * outside; //ci = cj * ci - j - 1
            }
        }
        return dp[n];
    }
}
