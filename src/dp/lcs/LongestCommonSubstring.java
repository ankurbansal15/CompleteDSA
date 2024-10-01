package dp.lcs;

import java.util.Arrays;

public class LongestCommonSubstring {

    public static void main(String[] args) {
        String str1 = "pABCDEiii";
        String str2 = "ABGCE";
        int n = str1.length();
        int m = str2.length();
        System.out.println(longestCommonSubstring(str1, str2, n, m, 0));
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(longestCommonSubstringTab(str1, str2));
    }

    public static int longestCommonSubstring(String s1, String s2, int m, int n, int count) {
        if (m == 0 || n == 0) {
            return count;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            count = longestCommonSubstring(s1, s2, m - 1, n - 1, count + 1);
        }
        int count1 = longestCommonSubstring(s1, s2, m - 1, n, 0);
        int count2 = longestCommonSubstring(s1, s2, m, n - 1, 0);
        count = Math.max(count, Math.max(count1, count2));
        return count;
    }


    public static int longestCommonSubstringTab(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        int ans = -1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }
}

