package graphs.directed;

import graphs.Edge;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair pair) {
            return this.path - pair.path; // Path based sorting for my pairs.
        }
    }
    //O(V + E logV)
    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        int[] dist = new int[graph.length];
        for(int i = 0; i<graph.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.n]){
                visited[curr.n] = true;
                //neighbours
                for(int i = 0; i<graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]){ //update distance of src to v;
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v,dist[v]));
                    }

                }
            }
        }
        //Print all source to vertices shortest distance
        for (int i : dist) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        dijkstra(graph,src);

    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }
}
