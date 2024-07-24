package graphs.matrix;

public class FloodFillAlgorithm {
    public static void main(String[] args) {

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean[][] visited = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, visited, image[sr][sc]);
        return image;
    }
    //O(m*n)
    private static void helper(int[][] image, int sr, int sc, int color, boolean[][] visited, int orgColor) {
     if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc] || image[sr][sc] != orgColor){
         return;
     }
     //left
        helper(image,sr, sc-1, color,visited,orgColor);
     //right
        helper(image,sr, sc+1, color,visited,orgColor);
     //up
        helper(image,sr-1, sc, color,visited,orgColor);
     //down
        helper(image,sr+1, sc, color,visited,orgColor);

    }
}