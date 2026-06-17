class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for(int j=i+1;j<n-1;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                for(int k=j+1;k<n;k++){
                    if(k>j+1 && nums[k]==nums[k-1]){
                        continue;
                    }

                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        list.add(arr);
                    
                    }
                }
            }
        }

        return list;
    }
}
