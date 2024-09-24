package recursion;

public class NumberToWords {

    public static void main(String[] args) {

        convert(2019);

    }

    public static void convert(int num) {

        String[] map = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if (num == 0) {
            return;
        }

        int lastDigit = num % 10;
        convert(num / 10);

        System.out.print(map[lastDigit] + " ");
    }

}
