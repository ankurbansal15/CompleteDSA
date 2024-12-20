package binary_search_tree;

import util.Node;

import java.util.ArrayList;

public class RootToLeafPaths {

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = new Node(values[0]);
        for (int i = 1; i < values.length; i++) {
            BuildBST.build(root, values[i]);
        }
        printRootToLeaf(root, new ArrayList<>());
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            print(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.removeLast();

    }

    public static void print(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }
}
