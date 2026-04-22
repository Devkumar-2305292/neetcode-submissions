class Solution {
    public int dfs(int i, int[] dp, int[] nums){
        if(i>=nums.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int pick=nums[i]+dfs(i+2, dp, nums);
        int notpick=dfs(i+1, dp, nums);

        dp[i]=Math.max(pick, notpick);

        return dp[i];
    }

    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp, -1);

        return dfs(0, dp, nums);
    }
}
