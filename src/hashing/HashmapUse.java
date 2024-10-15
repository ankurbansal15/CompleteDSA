package hashing;

import java.util.HashMap;

public class HashmapUse {
    public static void main(String[] args){


        HashMap<String,Integer> hp = new HashMap<>();

        hp.put("one",1);
        hp.put("two",2);
        hp.put("three",3);
        hp.put("four",4);

        System.out.println(hp);

        hp.remove("four");
        System.out.println(hp);
        
        int a = hp.get("one");
        System.out.println(a);

        System.out.println(hp.containsKey("three"));
        System.out.println(hp.containsKey("five"));


        
    }
}