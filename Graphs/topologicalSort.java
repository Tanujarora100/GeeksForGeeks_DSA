class Solution
{
    //Function to return list containing vertices in Topological order. 
    static void dfs(int start, boolean[] visited, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj)
    {
        visited[start]=true;
        for(int neighbour:adj.get(start))
        {
            if(visited[neighbour]==false)
            {
                dfs(neighbour,visited,st,adj);
            }
        }
        st.push(start);
        
    }
    
    
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean visited[]= new boolean[V];
        int ans[]= new int[V];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false) { dfs(i,visited,st,adj); }
        }
        int i=0;
        while(!st.isEmpty())
        {  
            ans[i++]=st.pop();
            
        }         
        return ans;
    }
}
