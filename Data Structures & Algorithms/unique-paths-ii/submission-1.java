class Solution {
    public int dfs(int i, int j, int n, int m, int[][] arr, int[][] dp){
        if(i<0 || i>=n || j<0 || j>=m || arr[i][j]==1){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(i==n-1 && j==m-1){
            return 1;
        }

        return dp[i][j] = dfs(i+1, j, n, m, arr, dp) + dfs(i, j+1, n, m, arr, dp);
    }

    public int uniquePathsWithObstacles(int[][] arr) {
        int[][] dp=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i], -1);
        }

        return dfs(0, 0, arr.length, arr[0].length, arr, dp);
    }
}