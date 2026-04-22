class Solution {
    public int dfs(int i, int n, int[] dp, int[] nums){
        if(i>=n){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int pick=nums[i]+dfs(i+2, n, dp, nums);
        int notpick=dfs(i+1, n, dp, nums);

        dp[i]=Math.max(pick, notpick);

        return dp[i];
    }

    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];

        int[] dp1=new int[nums.length];
        Arrays.fill(dp1, -1);
        int[] dp2=new int[nums.length];
        Arrays.fill(dp2, -1);

        return Math.max(dfs(0, nums.length-1, dp1, nums), dfs(1, nums.length, dp2, nums));
    }
}
