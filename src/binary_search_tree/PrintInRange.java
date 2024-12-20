package binary_search_tree;

import util.Node;

public class PrintInRange {

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = new Node(values[0]);
        for (int i = 1; i < values.length; i++) {
            BuildBST.build(root, values[i]);
        }
        printInRange(root, 1, 7);
    }

    public static void printInRange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {

            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);

        } else if (root.data > k2) {

            printInRange(root.right, k1, k2);

        } else {

            printInRange(root.left, k1, k2);

        }
    }

}
