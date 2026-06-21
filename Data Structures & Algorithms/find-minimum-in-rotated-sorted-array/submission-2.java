class Solution {
    public int findMin(int[] nums) {
        //5,0,1,2,3,4
        //if nums[mid]>nums[r] -> move left 
        //if nums[mid]<nums[r] -> move right

        int left=0, right=nums.length-1;
        int res=nums[0];
        while(left<=right){
            if(nums[left]<nums[right]){
                res = Math.min(res, nums[left]);
                break;
            }

            int mid=left+(right-left)/2;//4
            res=Math.min(res, nums[mid]);
            if(nums[mid]>=nums[left]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return res;
    }
}
