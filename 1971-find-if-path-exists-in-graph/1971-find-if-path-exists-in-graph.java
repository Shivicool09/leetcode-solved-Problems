class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj= new ArrayList<>();
        boolean  vis[] =  new boolean[n+1];
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int arr[]: edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
            
        }
        return dfs(source, destination , vis, adj);
        
    }
    public boolean dfs(int source, int dest, boolean vis[], List<List<Integer>> adj){
        if(source==dest) return true;
        vis[source]= true;
        for(int adjc: adj.get(source))
            if(!vis[adjc] && dfs(adjc,dest,vis,adj)) return true;
        return false;
    }
}