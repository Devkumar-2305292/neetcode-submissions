class Solution {
    public void helper(List<List<Integer>> list, List<Integer> temp, int index, int[] nums){
        list.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }

            temp.add(nums[i]);
            helper(list, temp, i+1, nums);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(list, temp, 0, nums);

        return list;
    }
}
