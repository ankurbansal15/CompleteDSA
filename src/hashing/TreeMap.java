package hashing;

import java.util.HashMap;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> tm = new java.util.TreeMap<>();

        tm.put("b", 1);
        tm.put("c", 2);
        tm.put("a", 3);
        tm.put("d", 1);

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);
        hm.put("d", 1);

        System.out.println(tm);
        System.out.println(hm);
    }
}
