package heaps;

import java.util.PriorityQueue;

public class NearestCars {

    static class Point implements Comparable<Point> {
        int x, y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
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
            list.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + list.remove().idx + " ");
        }
    }
}