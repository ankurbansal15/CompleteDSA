package heaps;

import java.util.PriorityQueue;

public class PQObjects {

    private static class Student implements Comparable<Student> {
        int rank;
        String name;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.print(pq.peek().name + "--->" + pq.peek().rank);
            System.out.println();
            pq.remove();
        }

    }
}
