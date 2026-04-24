class Solution {
    public boolean dfs(int node, int parent, List<List<Integer>> adj, boolean[] visited){
        visited[node]=true;

        for(int nei:adj.get(node)){
            if(!visited[nei]){
                if(!dfs(nei, node, adj, visited)){
                    return false;
                }
            }else if(nei!=parent){
                return false;
            }
        }

        return true;
    }

    public boolean validTree(int n, int[][] edges) {
        if(n-1!=edges.length){
            return false;
        }
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited=new boolean[n];

        if(!dfs(0, -1, adj, visited)){
            return false;
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }

        return true;
    }
}
