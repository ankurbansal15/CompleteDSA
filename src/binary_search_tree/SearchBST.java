package binary_search_tree;

import util.Node;

public class SearchBST {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        if (search(root, 7)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

}
