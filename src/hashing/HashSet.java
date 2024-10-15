package hashing;

public class HashSet {

    public static void main(String[] args) {
        java.util.HashSet<Integer> hs = new java.util.HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(1);

        System.out.println(hs);

        System.out.println(hs.contains(1));

        hs.remove(1);

        System.out.println(hs);

    }
}
