package arrays;

public class RainWaterTrapping {

    public static void main(String[] args) {
        int[] bars = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rainWaterTrapping(bars));

    }

    public static int rainWaterTrapping(int[] bars) {
        int n = bars.length;
        //Calculate left max boundary
        int[] prefix = new int[n];
        prefix[0] = bars[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(bars[i], prefix[i - 1]);

        }

        //calculate right max boundary
        int[] suffix = new int[n];
        suffix[n - 1] = bars[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(bars[i], suffix[i + 1]);
        }

        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //calculate min(left,right) = water level
            int waterLevel = Math.min(prefix[i], suffix[i]);

            //trapped water  = water level - height

            trappedWater += waterLevel - bars[i];
        }

        return trappedWater;
    }

}
