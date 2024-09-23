package bit_manipulation;

public class FastExponentiation {

    public static void main(String[] args) {
        int a = 5;
        int n = 3;

        System.out.println(fastExponentiation(a, n));
    }
    public static int fastExponentiation(int a, int n) {

        // Using the power value as a bit number
        // if LSB of bit number is 1 multiply the answer with a and take a^2
        // if LSB of bit number is 0 the do nothing and take a^2

        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;

        }

        return ans;
    }

}
