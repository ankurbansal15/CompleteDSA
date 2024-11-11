package arraylist;

import java.util.ArrayList;

public class PairSumRotatedList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum(list, target));

    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int n = list.size();

        int BP = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                BP = i;
                break;
            }
        }

        int leftP = BP + 1;
        int rightP = BP;

        while (leftP != rightP) {
           
            if (list.get(leftP) + list.get(rightP) == target) {
                return true;
            }

            if (list.get(leftP) + list.get(rightP) < target) {
                leftP = (leftP + 1) % n;

            } else {
                rightP = (n + rightP - 1) % n;
            }

        }

        return false;
    }

}
