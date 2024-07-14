package graphs.directed;
import graphs.*;
import java.util.*;

public class TopologicalSortingUsingBFS {
    //Kahn's Algorithm
    public static void main(String[] args) {
     int  V = 6;
     ArrayList<Edge>[] graph = new ArrayList[V];
     createGraph(graph);
     topSort(graph);
    }
    public static void calcInDeg(ArrayList<Edge>[] graph, int[] inDeg){
        for (ArrayList<Edge> edges : graph) {
            for (Edge e : edges) {
                inDeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph){
        int[] inDeg = new int[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        calcInDeg(graph,inDeg);
        for(int i = 0; i<inDeg.length;i++){
            if(inDeg[i] == 0){
                queue.add(i);
            }
        }

        //bfs
        while(!queue.isEmpty()){
            int curr = queue.remove();
            System.out.print(curr + " "); //topological sort print

            for(int i = 0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                inDeg[e.dest]--;
                if(inDeg[e.dest] == 0){
                    queue.add(e.dest);
                }
            }
        }
        System.out.println();


    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }

}
