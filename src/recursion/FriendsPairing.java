package recursion;

public class FriendsPairing {

    public static void main(String[] args) {

        System.out.println(friendPairs(3));

    }

    public static int friendPairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int ways1 = friendPairs(n - 1);
        int ways2 = (n - 1) * friendPairs(n - 2);
        return ways1 + ways2;

    }

}
