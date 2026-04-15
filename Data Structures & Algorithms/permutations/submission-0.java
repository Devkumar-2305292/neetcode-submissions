class Solution {
    public void helper(int[] nums, List<List<Integer>> list, List<Integer> temp, boolean[] used){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }

            temp.add(nums[i]);
            used[i]=true;

            helper(nums, list, temp, used);

            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        helper(nums, list, temp, used);

        return list;
    }
}
