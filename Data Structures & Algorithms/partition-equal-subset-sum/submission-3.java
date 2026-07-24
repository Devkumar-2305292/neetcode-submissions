class Solution {
    boolean[][] dp;

    public boolean dfs(int[] nums, int i,  int sum){
        if(i==nums.length){
            return sum==0;
        }

        

        if(sum<0){
            return false;
        }

        if(dp[i][sum]!=false){
            return dp[i][sum];
        }

        dp[i][sum] = dfs(nums, i+1,  sum-nums[i]) || dfs(nums, i+1,  sum);
        return dp[i][sum];
    }

    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if(sum%2!=0) return false;

        dp=new boolean[n][sum/2 + 1];

        return dfs(nums, 0, sum/2);
    }
}
