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
        int time = 0;
        int[] disc = new int[n];
        int[] low = new int[n];
        boolean[] inStack = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> sccList = new ArrayList<>();

        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        for (int i = 0; i < n; i++) {
            if (disc[i] == -1) {
                dfs(i, graph, disc, low, inStack, stack, sccList, new int[]{time});
            }
        }

        return sccList;
    }

    private static void dfs(int u, List<List<Integer>> graph, int[] disc, int[] low,
                     boolean[] inStack, Stack<Integer> stack, List<List<Integer>> sccList, int[] timeRef) {
        disc[u] = low[u] = timeRef[0]++;
        stack.push(u);
        inStack[u] = true;

        for (int v : graph.get(u)) {
            if (disc[v] == -1) {
                dfs(v, graph, disc, low, inStack, stack, sccList, timeRef);
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
