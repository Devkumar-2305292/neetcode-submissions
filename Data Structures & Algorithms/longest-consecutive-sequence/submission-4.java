class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int len=1;
            int x=nums[i];

            while(set.contains(x+1)){
                len++;
                x++;
            }

            max=Math.max(max, len);
        }

        return max;
    }
}
