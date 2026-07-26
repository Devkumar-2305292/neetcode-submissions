class Solution {

    public int helper(int i, int j, int n, int m, int[][] grid, int[][] dp) {

        if(i >= n || j >= m)
            return Integer.MAX_VALUE;

        if(i == n - 1 && j == m - 1)
            return grid[i][j];

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int right = helper(i, j + 1, n, m, grid, dp);
        int down = helper(i + 1, j, n, m, grid, dp);

        return dp[i][j] = grid[i][j] + Math.min(right, down);
    }

    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, grid.length, grid[0].length, grid, dp);
    }
}