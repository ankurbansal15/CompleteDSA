package hashing;

import java.util.HashSet;
import java.util.Iterator;
public class IterationHashset {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        for(Integer i : hs){
            System.out.print(i+" ");
        }
    }
    
}
