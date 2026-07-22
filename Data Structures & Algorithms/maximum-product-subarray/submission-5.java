class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar=nums[0];
        int currMax=1;
        int currMin=1;

        for(int i=0;i<nums.length;i++){
            int temp=currMax*nums[i];
            currMax=Math.max(Math.max(currMax*nums[i], currMin*nums[i]), nums[i]);
            currMin=Math.min(Math.min(temp, nums[i]*currMin), nums[i]);

            maxSoFar=Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }
}
