package graphs.undirected;

import graphs.Edge;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        /*
        1 ----- 3
       /        |  \
      0         |   5
       \        |  /
         2 ---- 4
         */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dfs(graph,0);

    }
    private static void dfs(ArrayList<Edge>[] graph, int curr){
        boolean[] visited = new boolean[graph.length];
        for(int i = 0;i<graph.length;i++){
            if(!visited[i]){
                dfsUtil(graph,curr,visited);
            }
        }
    }
    //O(V+E)
    private static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited){
        System.out.print(curr + " ");
        visited[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge edge = graph[curr].get(i);
            if(!visited[edge.dest]){
                dfsUtil(graph,edge.dest,visited);
            }
        }
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
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));

    }
}
