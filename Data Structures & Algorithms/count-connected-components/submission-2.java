class Solution {
    public void dfs(int node, boolean[] visited, List<List<Integer>> adj){
        if(visited[node]){
            return;
        }

        visited[node]=true;

        for(int nei:adj.get(node)){
            dfs(nei, visited, adj);
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
                count++;
                dfs(edge[0], visited, adj);
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
