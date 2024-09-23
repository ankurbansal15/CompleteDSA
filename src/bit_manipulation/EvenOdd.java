package bit_manipulation;

public class EvenOdd {

    public static void main(String[] args) {

        evenOrOdd(3);
        evenOrOdd(5);
        evenOrOdd(2);
        evenOrOdd(8);

    }

    public static void evenOrOdd(int n) {
        int bitmask = 1;

        if ((n & bitmask) == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }

}
