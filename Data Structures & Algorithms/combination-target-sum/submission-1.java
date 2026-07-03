class Solution {
    public void helper(
        int i, int[] nums, int target, List<Integer> temp, List<List<Integer>> list) {
        if (i == nums.length) {
            if (target == 0) {
                list.add(new ArrayList<>(temp));
            }

            return;
        }

        // take:
        if (target >= nums[i]) {
            temp.add(nums[i]);
            helper(i, nums, target - nums[i], temp, list);
            temp.remove(temp.size() - 1);
        }

        // nottake:
        helper(i + 1, nums, target, temp, list);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(0, nums, target, temp, list);

        return list;
    }
}
