package hashing;

import java.util.HashMap;

public class LinkedHashMap {
    public static void main(String[] args){
        java.util.LinkedHashMap<String,Integer> lhm = new java.util.LinkedHashMap<>();

        lhm.put("first",1);
        lhm.put("second",2);
        lhm.put("third",3);
        lhm.put("one",1);

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("first",1);
        hm.put("second",2);
        hm.put("third",3);
        hm.put("one",1);

        System.out.println(lhm);
        System.out.println(hm);
    }
}
