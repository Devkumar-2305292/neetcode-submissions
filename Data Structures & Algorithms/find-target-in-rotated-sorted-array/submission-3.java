class Solution {
    public int binarySearch(int[] nums, int target, int left, int right){
        while(left<=right){
            int mid=(right+left)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }

            
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        //5,6,7,8,1,2

        int l=0, r=nums.length-1;
        while(l<r){
            int mid=(r+l)/2;

            if(nums[mid]>nums[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }

        int index=l;
        int result = binarySearch(nums, target, 0, index-1);
        if(result!=-1){
            return result;
        }

        return binarySearch(nums, target, index, nums.length-1);
    }
}
