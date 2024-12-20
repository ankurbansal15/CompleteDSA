package binary_search_tree;

import util.Node;

public class MirrorBST {

    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);


        /*
                 8
                / \
               /   \
              5     10
             / \      \
            3   6      11
         */

        PrintBST.preOrder(root);

        mirror(root);

        System.out.println();

        PrintBST.preOrder(root);
    }
    // O(n)
    public static Node mirror(Node root) {

        if (root == null) {
            return null;
        }

        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

}
