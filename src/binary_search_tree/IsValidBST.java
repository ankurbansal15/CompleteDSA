package binary_search_tree;

import util.Node;

public class IsValidBST {
    public static void main(String[] args) {

        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        int n = values.length;

        for (int i = 0; i < n; i++) {
            root = BuildBST.build(root, values[i]);
        }

        System.out.println(isValidBST(root, null, null));

    }

    public static boolean isValidBST(Node root, Node min, Node max){

        if(root == null){
            return true;
        }

        if(min != null &&  root.data <= min.data ){
            return false;
        }

        else if(max != null && max.data <= root.data){
            return false;
        }

        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }
}
