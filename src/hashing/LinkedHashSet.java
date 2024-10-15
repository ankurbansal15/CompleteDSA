package hashing;

import java.util.HashSet;
import java.util.TreeSet;

public class LinkedHashSet {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(3);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        for (Integer j : hs) {
            System.out.print(j + " ");
        }
        System.out.println();

        java.util.LinkedHashSet<Integer> lhs = new java.util.LinkedHashSet<>();

        lhs.add(3);
        lhs.add(4);
        lhs.add(2);
        lhs.add(1);

        for (Integer i : lhs) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Tree set using sorted order");

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(3);
        ts.add(4);
        ts.add(2);
        ts.add(1);

        for (Integer i : ts) {
            System.out.print(i + " ");
        }

    }
}
