package bit_manipulation;

public class ModularExponentiation {

    public static void main(String[] args) {

        System.out.println(modularExponentiation(2, 10, 1000000007));
    }

    public static long modularExponentiation(long base, long exponent, long mod) {

        long result = 1;
        base = base % mod;

        while (exponent > 0) {

            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;

            exponent >>= 1;
        }

        return result;
    }
}

