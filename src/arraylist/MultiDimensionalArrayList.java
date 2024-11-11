package arraylist;

import java.util.ArrayList;

public class MultiDimensionalArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        mainList.add(list);
        mainList.add(list2);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> curr = mainList.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();

        }

    }

}
