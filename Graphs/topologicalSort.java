package Graphs.Algorithm;

import java.util.*;

public class topologicalSort {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
        adj.get(source).add(dest);
    }

    static void dfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> st) {
        visited[start] = true;
        for (int neighbour : adj.get(start)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, st);
            }
        }
        st.add(start);
    }

    static void topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        int arr[] = new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }

        while (!st.isEmpty()) {
            int temp = st.pop();
            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int V = 5;
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);

        System.out.println("Following is a Topological Sort of:");
        topoSort(V, adj);
    }
}
