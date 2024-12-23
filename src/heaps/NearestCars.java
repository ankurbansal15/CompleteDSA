package heaps;

import java.util.PriorityQueue;

public class NearestCars {

    private static class Point implements Comparable<Point> {
        int distSq;
        int idx;

        public Point(int distSq, int idx) {
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String[] args) {
        int[][] pts = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> list = new PriorityQueue<>();

        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            list.add(new Point(distSq, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + list.remove().idx + " ");
        }
    }
}
