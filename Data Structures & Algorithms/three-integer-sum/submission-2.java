class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr=new ArrayList<>();
        
        int n=nums.length;

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left=i+1;
            int right=n-1;

            while(left<right){
                int sum=nums[left]+nums[right];
                if(sum==(-nums[i])){
                    List<Integer> sub=new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[left]);
                    sub.add(nums[right]);
                    arr.add(sub);
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                    
                }else if(sum>(-nums[i])){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return arr;
    }
}
