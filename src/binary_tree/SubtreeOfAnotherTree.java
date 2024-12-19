package binary_tree;

import util.Node;

public class SubtreeOfAnotherTree {

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
              2     3
             / \   / \
            4   5 6   7

         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

         /*

           2
          / \
         4   5

         */

        System.out.println(isSubtree(root, subRoot));

    }

    public static boolean isIdentical(Node node, Node subRoot) {

        if (node == null && subRoot == null) {
            return true;
        }
        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);

    }

    public static boolean isSubtree(Node root, Node subRoot) {

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data && isIdentical(root, subRoot)) {
            return true;
        }

        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        return left || right;
    }
}
