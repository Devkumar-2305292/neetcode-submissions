class Solution {
    public int helper(int curr, int n, int[] dp){
        if(curr>n){
            return 0;
        }

        if(dp[curr]!=-1){
            return dp[curr];
        }

        if(curr==n){
            return 1;
        }


        int takeOne=helper(curr+1, n, dp);
        int takeTwo=helper(curr+2, n, dp);

        return dp[curr]=takeOne+takeTwo;
    }

    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);

        return helper(0, n, dp);
    }
}
