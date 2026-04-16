class Solution {
    public boolean dfs(int node, int parent, List<List<Integer>> adj, boolean[] visited){
        if(visited[node]){
            return true;
        }

        visited[node]=true;
        for(int nei:adj.get(node)){
            if(parent==nei){
                continue;
            }

            if(dfs(nei, node, adj, visited)){
                return true;
            }
        }

        return false;
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);

            boolean[] visited=new boolean[n+1];
            if(dfs(edge[0], -1, adj, visited)){
                return edge;
            }
        }

        return new int[0];
    }
}
