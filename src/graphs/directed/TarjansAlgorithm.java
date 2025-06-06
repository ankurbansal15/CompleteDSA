package graphs.directed;

import java.util.*;

public class TarjansAlgorithm {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        graph.get(0).add(2);
        graph.get(2).add(1);
        graph.get(1).add(0);
        graph.get(0).add(3);
        graph.get(3).add(4);

        List<List<Integer>> sccs = tarjansAlgorithm(n, graph);

        for (List<Integer> scc : sccs) {
            System.out.println(scc);
        }
    }
    public static List<List<Integer>> tarjansAlgorithm(int n, List<List<Integer>> graph) {
        int[] disc = new int[n];
        int[] low = new int[n];
        boolean[] visited = new boolean[n];
        boolean[] inStack = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> sccList = new ArrayList<>();
        int[] time = new int[]{0};

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, disc, low, stack, inStack, time, sccList);
            }
        }

        return sccList;
    }

    private static void dfs(int u, List<List<Integer>> graph,
                     boolean[] visited, int[] disc, int[] low,
                     Stack<Integer> stack, boolean[] inStack,
                     int[] time, List<List<Integer>> sccList) {

        visited[u] = true;
        disc[u] = low[u] = time[0]++;
        stack.push(u);
        inStack[u] = true;

        for (int v : graph.get(u)) {
            if (!visited[v]) {
                dfs(v, graph, visited, disc, low, stack, inStack, time, sccList);
                low[u] = Math.min(low[u], low[v]);
            } else if (inStack[v]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        if (low[u] == disc[u]) {
            List<Integer> scc = new ArrayList<>();
            while (true) {
                int node = stack.pop();
                inStack[node] = false;
                scc.add(node);
                if (node == u) break;
            }
            sccList.add(scc);
        }
    }
}
