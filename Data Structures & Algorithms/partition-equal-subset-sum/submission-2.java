class Solution {
    public boolean dfs(int[] nums, int i,  int sum){
        if(i==nums.length){
            return sum==0;
        }

        

        if(sum<0){
            return false;
        }

        return dfs(nums, i+1,  sum-nums[i]) || dfs(nums, i+1,  sum);
    }

    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if(sum%2!=0) return false;

        return dfs(nums, 0, sum/2);
    }
}
