class Solution {
    public int helper(int buy, int i, int[] prices,  int[][] dp){
        if(i>=prices.length){
            return 0;
        }

        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }

        int profit;
        //Buy
        if(buy==1){
            //pick
            int take=-prices[i]+helper(0, i+1, prices, dp);
            //notpick
            int nottake=helper(1, i+1, prices, dp);
            profit=Math.max(take, nottake);
        }else{
            //sell
            int sell=prices[i]+helper(1, i+2, prices, dp);

            int notsell=helper(0, i+1, prices, dp);
            profit=Math.max(sell, notsell);
        }

        
        dp[i][buy]=profit;
        return dp[i][buy];
    }

    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(1, 0, prices, dp);
    }
}
