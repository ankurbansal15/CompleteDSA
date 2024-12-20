package binary_search_tree;

class AVLTree {

    public static class TreeNode {
        int key, height;
        TreeNode left, right;

        TreeNode(int d) {
            key = d;
            height = 1;
        }
    }

    private TreeNode root;

    private int height(TreeNode N) {
        return (N == null) ? 0 : N.height;
    }

    public int getBalance(TreeNode N) {
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    public TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public TreeNode insert(TreeNode treeNode, int key) {
        if (treeNode == null) {
            return new TreeNode(key);
        }

        if (key < treeNode.key) {
            treeNode.left = insert(treeNode.left, key);
        } else if (key > treeNode.key) {
            treeNode.right = insert(treeNode.right, key);
        } else {
            return treeNode;
        }

        treeNode.height = Math.max(height(treeNode.left), height(treeNode.right)) + 1;

        int balance = getBalance(treeNode);

        if (balance > 1 && key < treeNode.left.key) {
            return rightRotate(treeNode);
        }

        if (balance < -1 && key > treeNode.right.key) {
            return leftRotate(treeNode);
        }

        if (balance > 1 && key > treeNode.left.key) {
            treeNode.left = leftRotate(treeNode.left);
            return rightRotate(treeNode);
        }

        if (balance < -1 && key < treeNode.right.key) {
            treeNode.right = rightRotate(treeNode.right);
            return leftRotate(treeNode);
        }

        return treeNode;
    }

    public void inOrder(TreeNode treeNode) {
        if (treeNode != null) {
            inOrder(treeNode.left);
            System.out.print(treeNode.key + " ");
            inOrder(treeNode.right);
        }
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    public void inOrder() {
        inOrder(root);
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("In-order traversal of the AVL Tree:");
        tree.inOrder();
    }
}

