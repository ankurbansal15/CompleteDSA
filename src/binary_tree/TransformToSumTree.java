package binary_tree;

public class TransformToSumTree {

    public static void main(String[] args){

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

        /* expected sum tree

                27
               /  \
              9   13
             / \  / \
            0  0 0   0

        */

        transform(root);
        preorder(root);

    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int sum = root.data + leftChild + rightChild;
        root.data = leftChild + rightChild;
        return sum;
    
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
