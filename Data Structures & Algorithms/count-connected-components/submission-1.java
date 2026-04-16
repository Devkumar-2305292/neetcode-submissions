class Solution {
    public void dfs(boolean[] visited, List<List<Integer>> adj, int node){
        if(visited[node]){
            return;
        }

        visited[node]=true;
        for(int nei:adj.get(node)){
            dfs(visited, adj, nei);
        }
    }

    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited=new boolean[n];
        int count=0;

        for(int[] edge:edges){
            if(!visited[edge[0]]){
                // visited[edge[0]]=true;
                count++;
                dfs(visited, adj, edge[0]);
            }
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
            }
        }

        return count;
    }
}
