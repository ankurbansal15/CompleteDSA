package bit_manipulation;

public class NumberPowerOfTwo {

    public static void main(String[] args) {

        System.out.println(powerOfTwo(8));

    }

    public static boolean powerOfTwo(int n) {
        return (n & n - 1) == 0;
    }

}
