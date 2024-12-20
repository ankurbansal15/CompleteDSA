package binary_search_tree;

import util.Node;

public class DeleteNode {

    public static void main(String[] args) {

        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        int n = values.length;

        for (int i = 0; i < n; i++) {
            root = BuildBST.build(root, values[i]);
        }

        PrintBST.inorder(root);
        System.out.println();
        delete(root, 5);
        PrintBST.inorder(root);
    }


    public static Node delete(Node root, int val) {

        if (root.data < val) { // so going right side
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {

            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - have both children
            Node is = findInOrderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }









}
