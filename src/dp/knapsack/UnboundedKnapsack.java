package dp.knapsack;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        int[] dp = new int[W + 1];
        for (int i = 0; i <= W; i++) {
            dp[i] = -1;
        }
        System.out.println(unboundedKnapsackTab(val, wt, W));
        System.out.println(unboundedKnapsackMemo(W, wt, val, val.length, dp));
        System.out.println(unboundedKnapsack(W, wt, val, val.length));
    }

    //n*w
    public static int unboundedKnapsackTab(int[] val, int[] wt, int W) {
        int n = val.length;
        int[] dp = new int[W + 1];

        for (int i = 0; i <= W; i++) {
            for (int j = 0; j < n; j++) {
                if (wt[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - wt[j]] + val[j]);
                }
            }
        }
        return dp[W];
    }
    public static int unboundedKnapsackMemo(int W, int[] wt, int[] val, int n, int[] dp) {
        if (W == 0) {
            return 0;
        }

        if (dp[W] != -1) {
            return dp[W];
        }

        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            if (wt[i] <= W) {
                maxVal = Math.max(maxVal, val[i] + unboundedKnapsackMemo(W - wt[i], wt, val, n, dp));
            }
        }

        dp[W] = maxVal;

        return dp[W];
    }
    public static int unboundedKnapsack(int W, int[] wt, int[] val, int n) {
        if (W == 0) {
            return 0;
        }

        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            if (wt[i] <= W) {
                maxVal = Math.max(maxVal, val[i] + unboundedKnapsack(W - wt[i], wt, val, n));
            }
        }

        return maxVal;
    }

    public static void print(int[][] dp) {
        for (int[] i : dp) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
