package recursion;

public class PrintNumberDecreasingOrder {
    public static void main(String[] args) {

        printDecreasing(10);

    }

    public static void printDecreasing(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);
    }
}


