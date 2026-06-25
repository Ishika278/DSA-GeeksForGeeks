class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int v = adj.size();
        
        boolean[]visited = new boolean[v];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(0);
        visited[0] = true;
        
        while(!q.isEmpty())
        {
            int node = q.poll();
            ans.add(node);
            
            for(int neighbor : adj.get(node))
            {
                if(!visited[neighbor])
                {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
        return ans;
    }
}