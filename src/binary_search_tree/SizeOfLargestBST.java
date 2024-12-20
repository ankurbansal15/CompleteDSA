package binary_search_tree;

import util.Node;

public class SizeOfLargestBST {

    public static class Info {
        boolean isBst;
        int size;
        int min;
        int max;
        int maxBSTSize;

        public Info(boolean isBst, int size, int min, int max, int maxBSTSize) {
            this.isBst = isBst;
            this.min = min;
            this.max = max;
            this.size = size;
            this.maxBSTSize = maxBSTSize;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);

        root.right.left = new Node(45);

        root.right.right = new Node(70);

        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largestBST(root);

        System.out.println("largest bst size is " + info.maxBSTSize);
    }

    public static Info largestBST(Node root) {

        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        int maxBSTSize = Math.max(leftInfo.maxBSTSize, rightInfo.maxBSTSize);

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max,maxBSTSize);
        }

        if (leftInfo.isBst && rightInfo.isBst) {
            maxBSTSize = Math.max(maxBSTSize, size);
            return new Info(true, size, min, max,maxBSTSize);
        }
        return new Info(false, size, min, max,maxBSTSize);
    }
}
