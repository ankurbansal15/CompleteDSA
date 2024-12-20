package binary_search_tree;
import util.Node;
public class SortedArrayToBST {

    public static void main(String[] args){
        int[] arr = {3,5,6,8,10,11,12};
        Node root = createBST(arr,0,arr.length-1);
        PrintBST.preOrder(root);
    }

    public static Node createBST(int[] arr, int st, int end){

        if(st>end) {
            return null;
        }

        int mid = (st+((end-st)/2));

        Node root = new Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);

        return root;

    }

}
