class Solution {
    public long dfs(int r, int c, int n, int m, int[][] points, Long[][] dp){
        if(dp[r][c]!=null){
            return dp[r][c];
        }

        if(r==n-1){
            return 0;
        }
        long res=0;
        for(int i=0;i<m;i++){
            res=Math.max(res, points[r+1][i] - Math.abs(i-c) + dfs(r+1, i, n, m, points, dp));
        }

        return dp[r][c] = res;
    }

    public long maxPoints(int[][] points) {
        int n=points.length;
        int m=points[0].length;
        Long[][] dp=new Long[n][m];

        long ans=0;

        for(int i=0;i<m;i++){
            ans=Math.max(ans, points[0][i]+dfs(0, i, n, m, points, dp));
        }

        return ans;
    }
}