package arrays;

public class PassingArrayAsAnArgument {

    public static void main(String[] args) {
        int[] marks = {97, 98, 99};

        int nonChangeable = 5;

        updateArray(marks, nonChangeable);


        System.out.print(marks[0] + " ");
        System.out.print(marks[1] + " ");
        System.out.println(marks[2] + " \n");

        System.out.print(nonChangeable);
    }

    public static void updateArray(int[] marks, int nonChangeable) {

        nonChangeable += 10;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        System.out.println(nonChangeable);

    }



}
