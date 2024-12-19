package binary_tree;

import util.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         *       1
         *     /   \
         *    2     3
         *   / \   / \
         *  4   5 6   7
         */

        topView(root);

    }

    private static class Pair {

        Node node;
        int horizontalDistance;

        public Pair(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }

    }

    public static void topView(Node root) {

        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Pair(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Pair curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (!map.containsKey(curr.horizontalDistance)) {
                    map.put(curr.horizontalDistance, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Pair(curr.node.left, curr.horizontalDistance - 1));
                    min = Math.min(min, curr.horizontalDistance - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Pair(curr.node.right, curr.horizontalDistance + 1));
                    max = Math.max(max, curr.horizontalDistance + 1);
                }

            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }


}
