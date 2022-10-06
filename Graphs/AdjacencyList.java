package Graphs;

import java.util.ArrayList;

class Graph
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest)
    {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        printGraph(adj);
    }
}
