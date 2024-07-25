package graphs.directed;

import graphs.Edge;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgorithm {
    public static void main(String[] args) {
       int V = 5;

       ArrayList<Edge>[] graph = new ArrayList[V];
       createGraph(graph);
       kosaraju(graph,V);


    }
    public static void kosaraju(ArrayList<Edge>[] graph, int V){ //O(E + V)
        //Step 1
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!visited[i]){
                topSort(graph,i,visited,stack);
            }
        }
        //Step 2
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for(int i = 0; i<graph.length;i++){
            visited[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for(int i = 0; i<V;i++){
            for(int j = 0; j<graph[i].size();j++){
                Edge e = graph[i].get(j); //e.dest -> e.src
                transpose[e.dest].add(new Edge(e.dest,e.src)); //reverse edge
            }
        }
        //Step 3
        while(!stack.isEmpty()){
            int curr = stack.pop();
            if(!visited[curr]){
                System.out.print("SCC -> ");
                dfs(transpose,curr, visited); //scc (Strongly Connected Components)
                System.out.println();
            }
        }



    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited){
        visited[curr] = true;
        System.out.print(curr + " ");
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph,e.dest,visited);
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack){
        visited[curr] = true;

        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topSort(graph,e.dest,visited,stack);
            }
        }
        stack.push(curr);
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));


    }
}
