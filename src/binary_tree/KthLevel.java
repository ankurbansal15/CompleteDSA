package binary_tree;

import util.Node;

public class KthLevel {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
                 1
                / \
               /   \
              3     2
             / \   / \
            4   5 6   7

         */

        kLevel(root, 1, 3);
    }

    public static void kLevel(Node root, int level, int K) {
        if (root == null) {
            return;
        }
        if (level == K) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level + 1, K);
        kLevel(root.right, level + 1, K);

    }
}
