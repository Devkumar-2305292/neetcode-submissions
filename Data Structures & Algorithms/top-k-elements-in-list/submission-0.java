class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int[] ans=new int[k];
        

        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int key=0;
            for(Map.Entry<Integer, Integer> entry: map.entrySet() ){
                if(entry.getValue()>max){
                    key=entry.getKey();
                    max=entry.getValue();
                }
            }

            ans[i]=key;
            map.remove(key);
        }

        return ans;
    }
}
