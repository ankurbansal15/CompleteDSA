package graphs;

import java.util.ArrayList;

public class ConnectedComponents {
    public static class Edge {
        public int src;
        public int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void main(String[] args) {
        /*
         0------3
        /|      |
       / |      |
      1  |      4
       \ |
        \|
         2
         */

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                return detectCycleUtil(graph,visited,i,-1);
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int par){
     visited[curr] = true;
     for(int i = 0;i<graph[curr].size();i++){
         Edge edge = graph[curr].get(i);
         //case 3
         if(!visited[edge.dest] && detectCycleUtil(graph,visited,edge.dest,curr)){
             return true;
         }
         //case 1
         if(visited[edge.dest] && curr != par){
             return true;
         }
     }
     return false;
    }
    private static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

    }


}
