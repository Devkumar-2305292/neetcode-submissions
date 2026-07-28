class Solution {
    public int helper(int i, int j, List<List<Integer>> tri, int[][] dp){
        if(i>=tri.size()){
            return 0;
        }

        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];        
        }

        return dp[i][j] = tri.get(i).get(j)+Math.min(helper(i+1, j, tri, dp), helper(i+1, j+1, tri, dp));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        
        // List<List<Integer>> dp=new ArrayList<>();
        // for(int i=0;i<triangle.size();i++){
        //     dp.add(new ArrayList<>());
        // }

        return helper(0, 0, triangle, dp);
    }
}