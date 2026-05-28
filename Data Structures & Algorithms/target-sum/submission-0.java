class Solution {
    public void helper(int totalSum, int i, int[] nums, int target, int[] count){
        if(i==nums.length){
            if(totalSum==target){
                count[0]++;
            }
            return;
        }

        //Addition:
        helper(totalSum+nums[i], i+1, nums, target, count);

        //Subtraction:
        helper(totalSum-nums[i], i+1, nums, target, count);
    }

    public int findTargetSumWays(int[] nums, int target) {
        int[] count=new int[1];
        count[0]=0;
        helper(0, 0, nums, target, count);

        return count[0];
    }
}
