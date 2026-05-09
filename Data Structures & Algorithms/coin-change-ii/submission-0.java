class Solution {
    public int helper(int i, int amount, int[] coins, int[][] dp){
        if(i>=coins.length || amount<0){
            return 0;
        }

        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }

        if(amount==0){
            return 1;
        }

        //pick
        int pick=0;
        pick=pick+helper(i, amount-coins[i], coins, dp);
        int notpick=helper(i+1, amount, coins, dp);

        dp[i][amount]=pick+notpick;
        return dp[i][amount];

    }

    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(0, amount, coins, dp);
    }
}
