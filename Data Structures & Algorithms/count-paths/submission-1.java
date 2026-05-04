class Solution {
    public int helper(int i, int j, int m, int n, int dp[][]){
        if(i<0 || i>=m || j<0 || j>=n){
            return 0;
        }

        if(i==m-1 && j==n-1){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        return dp[i][j]=helper(i+1, j, m, n, dp)+
        helper(i, j+1, m, n, dp);
    }

    public int uniquePaths(int m, int n) {
        int[] count=new int[1];
        count[0]=0;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, m, n, dp);
    }
}
