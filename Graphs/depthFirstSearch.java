
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class depthFirstSearch
{
    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest)
    {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
    private static void dfs(ArrayList<ArrayList<Integer>> adj, int Vertices)
    {
        Queue<Integer> q= new LinkedList<>();
        boolean visited[]= new boolean[Vertices+1];
        for (int i = 1; i <= Vertices; i++)
            visited[i] = false;
/// The start vertex or source vertex is 1
        int s = 1;

        // Mark the current node as
        // visited and enqueue it
        visited[s]=true;
        q.add(s);

        while (q.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = q.poll();
            System.out.print(s+" ");

            // Traverse the nodes adjacent to the currently
            // poped element and push those elements to the
            // queue which are not already visited
            for (int i = 0; i < adj.get(s).size(); i++) {

                // Fetch adjacent node
                int newNode = adj.get(s).get(i);

                // Check if it is not visited
                if(visited[newNode] == false)
                {
                    // Mark it visited
                    visited[newNode] = true;

                    // Add it to queue
                    q.add(newNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
        int V = 5;
//        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,3,4);
        addEdge(adj,2,4);
        dfs(adj,5);
    }
}
