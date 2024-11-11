package arraylist;

import java.util.ArrayList;

public class WaterContainerOptimized {

    public static void main(String[] args) {
        ArrayList<Integer> bars = new ArrayList<>();

        bars.add(1);
        bars.add(8);
        bars.add(6);
        bars.add(2);
        bars.add(5);
        bars.add(4);
        bars.add(8);
        bars.add(3);
        bars.add(7);

        System.out.println(capacity(bars));
    }

    public static int capacity(ArrayList<Integer> bars) {

        int leftP = 0;
        int rightP = bars.size() - 1;
        int maxWater = 0;

        while (leftP < rightP) {

            int height = Math.min(bars.get(leftP), bars.get(rightP));
            int water = height * (rightP - leftP);


            if (bars.get(leftP) < bars.get(rightP)) {
                leftP++;
            } else {
                rightP--;
            }

            maxWater = Math.max(water, maxWater);

        }

        return maxWater;
    }

}
