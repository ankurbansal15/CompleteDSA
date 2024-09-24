package recursion;

public class OptimisedXToThePowerN {

    public static void main(String[] args) {

        System.out.print(power(2, 3));
    }

    public static int power(int x, int n) {

        if (n == 1) {
            return x;
        }

        int ans = power(x, n / 2);
        int ansSq = ans * ans;

        if (n % 2 != 0) {
            ansSq = x * ansSq;
        }

        return ansSq;
    }

}
