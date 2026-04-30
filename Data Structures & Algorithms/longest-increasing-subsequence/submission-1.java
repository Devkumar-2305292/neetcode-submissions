class Solution {
    public int helper(int prev, int i, int[] nums, int[][] dp){
        if(i>=nums.length){
            return 0;
        }

        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }

        int pick=0;
        if(prev==-1 || nums[i]>nums[prev]){
            pick=1+helper(i, i+1, nums, dp);
        }
        int notpick=helper(prev, i+1, nums, dp);

        dp[i][prev+1]=Math.max(pick, notpick);
        return dp[i][prev+1];
    }

    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int prev=-1;
        int max=Integer.MIN_VALUE;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }

        for(int i=0;i<n;i++){
            
            int len=helper(prev, i, nums, dp);
            max=Math.max(max, len);
        }

        return max;
    }
}
