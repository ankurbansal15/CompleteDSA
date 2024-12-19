package binary_tree;

import util.Node;

public class BasicBinaryTree {

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

        System.out.println(height(root));

        System.out.println("Total nodes = " + count(root));

        System.out.println("Sum of the tree is = " + sum(root));

        System.out.println("Diameter of tree is = " + diameter(root));

        System.out.println("Diameter of tree optimized way is = " + diameter2(root).diameter);
    }

    public static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int count(Node root) {

        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;

    }


    public static int sum(Node root) {

        if (root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }

    // O(n^2)
    public static int diameter(Node root) {

        if (root == null) {
            return 0;
        }
        int leDia = diameter(root.left);
        int lfHeight = height(root.left);
        int rgDia = diameter(root.right);
        int rgHeight = height(root.right);

        int selfDiameter = lfHeight + rgHeight + 1;

        return Math.max(selfDiameter, Math.max(leDia, rgDia));
    }

    public static class Pair {

        int diameter;
        int height;

        public Pair(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Pair diameter2(Node root) {

        if (root == null) {
            return new Pair(0, 0);
        }

        Pair leftInfo = diameter2(root.left);
        Pair rightInfo = diameter2(root.right);

        int diam = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diameter, rightInfo.diameter));
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Pair(diam, ht);

    }

}
