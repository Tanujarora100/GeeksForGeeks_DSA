package Graphs.Implementation.DFS;

import java.util.ArrayList;

public class dfsPractice {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }

    static void dfsRecursive(int start, ArrayList<ArrayList<Integer>> adj, int Vertices, boolean visited[],
            ArrayList<Integer> ans) {
        visited[start] = true;
        ans.add(start);
        for (int u : adj.get(start)) {
            if (visited[start] == false) {
                dfsRecursive(start, adj, Vertices, visited, ans);
            }
        }
    }

    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj, int vertices) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (visited[i] == false) {
                dfsRecursive(i, adj, vertices, visited, ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);

        System.out.println("Following is Depth First Traversal for disconnected graphs: ");
        System.out.print(dfs(adj, V));

    }
}
