class Solution {

    public void helper(int i, int[] nums, List<Integer> temp, List<List<Integer>> list){
        if(i==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        helper(i+1, nums, temp, list);
        temp.remove(temp.size()-1);
        helper(i+1, nums, temp, list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(0, nums, temp, list);

        return list;
    }
}
