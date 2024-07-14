package graphs.undirected;

import graphs.Edge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartiteGraph {
    public static void main(String[] args) {
        //If graph does not have cycle then by default it is bipartite graph.
        /*
         0-------2
       /        /
     /        /
    1        4
     \     /
      \  /
       3
         */

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
    //O(V+E)
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i<graph.length;i++){
            if(color[i] == -1){ //BFS
                queue.add(i);
                color[i] = 0; //Yellow
                while(!queue.isEmpty()){
                    int curr = queue.remove();
                    for(int j = 0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j); //e.dest
                        if(color[e.dest] == -1){
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            queue.add(e.dest);
                        }else if(color[e.dest] == color[curr]){
                            return false; //Not Bipartite
                        }

                    }

                }
            }
        }
        return true;

    }
    private static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
//        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
//        graph[3].add(new Edge(3,4,1));

//        graph[4].add(new Edge(4,2,1));
//        graph[4].add(new Edge(4,3,1));

    }
}
