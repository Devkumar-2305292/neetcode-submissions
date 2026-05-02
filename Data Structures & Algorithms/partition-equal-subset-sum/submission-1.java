class Solution {
    public boolean helper(int i, int total, int[] nums, int[][] dp){
        if(total<0){
            return false;
        }

        if(i>=nums.length){
            return false;
        }

        if(total==0){
            return true;
        }

        if(dp[i][total]!=-1){
            return dp[i][total]==1;
        }

        boolean pick=helper(i+1, total-nums[i], nums, dp);
        boolean notpick=helper(i+1, total, nums, dp);

        boolean res=pick || notpick;
        dp[i][total]=res ? 1:0;

        return res;
    }

    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total=total+nums[i];
        }

        int[][] dp=new int[n][total/2+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }

        if(total%2!=0){
            return false;
        }

        return helper(0, total/2, nums, dp);
    }
}
