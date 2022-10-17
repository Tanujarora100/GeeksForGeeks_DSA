package Graphs.Algorithm;

import java.util.*;

public class topologicalKahn {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
        adj.get(source).add(dest);
    }

    static void kahnAlgo(int v, ArrayList<ArrayList<Integer>> adj) {
        int topo[] = new int[v];
        int indegree[] = new int[v];
        for (int i = 0; i < v; i++) {
            for (int neighbour : adj.get(i)) {
                indegree[neighbour]++;
            }

        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " " + " ");
            for (int it : adj.get(temp)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
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

        System.out.println("Following is a Topological Sort of Graph Using Kahn's Algorithm:");
        kahnAlgo(V, adj);
    }
}
