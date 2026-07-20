class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length;i++){
            sum=sum+i;
        }

        int sumarr=0;
        for(int i=0;i<nums.length;i++){
            sumarr=sumarr+nums[i];
        }

        return sum-sumarr;
    }
}
