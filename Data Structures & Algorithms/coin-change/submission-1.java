class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int dfs(int amount, int[] coins) {
        if (amount == 0)
            return 0;
        if (map.containsKey(amount)) {
            return map.get(amount);
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int result = dfs(amount - coins[i], coins);
                if (result != Integer.MAX_VALUE) {
                    res = Math.min(res, result + 1);
                }
            }
        }

        map.put(amount, res);
        return res;
    }

    public int coinChange(int[] coins, int amount) {
        int result = dfs(amount, coins);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
