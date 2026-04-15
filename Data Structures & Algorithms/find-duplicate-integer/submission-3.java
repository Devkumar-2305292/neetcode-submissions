class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        
        //3, 2, 1, 4, 4
        //-3,-2,-1, 
        for(int i=0;i<n;i++){
            if(nums[Math.abs(nums[i])-1]<=0){
                return Math.abs(nums[i]);
            }else{
                nums[Math.abs(nums[i])-1]*=-1;
            }
        }

        return -1;
    }
}
