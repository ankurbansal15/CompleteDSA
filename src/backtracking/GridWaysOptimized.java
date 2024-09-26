package backtracking;

public class GridWaysOptimized {

    public static void main(String[] args) {
        int n = 3, m = 3;

        int totalWays = fact(n - 1 + m - 1) / (fact(n - 1) * fact(m - 1));

        System.out.println(totalWays);
    }


    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

}
