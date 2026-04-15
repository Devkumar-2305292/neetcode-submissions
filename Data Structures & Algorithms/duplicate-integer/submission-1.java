class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map=new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return true;
        //     }else{
        //         map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        //     }
        // }

        // return false;

        Set<Integer> hashmap=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hashmap.contains(nums[i])){
                return true;
            }else{
                hashmap.add(nums[i]);
            }
        }

        return false;
    }
}