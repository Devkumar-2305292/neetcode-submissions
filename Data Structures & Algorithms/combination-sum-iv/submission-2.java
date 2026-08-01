

class Solution {

    public int helper(int target, int[] nums, int[] dp) {

        if (target == 0) {
            return 1;
        }

        if (dp[target] != -1) {
            return dp[target];
        }

        int ans = 0;

        for (int num : nums) {
            if (target >= num) {
                ans += helper(target - num, nums, dp);
            }
        }

        return dp[target] = ans;
    }

    public int combinationSum4(int[] nums, int target) {

        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);

        return helper(target, nums, dp);
    }
}