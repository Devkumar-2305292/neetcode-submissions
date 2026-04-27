class Solution {
    HashMap<Integer, Integer> map=new HashMap<>();

    public int dfs(int amount, int[] coins){
        if(amount==0){
            return 0;
        }

        if(map.containsKey(amount)){
            return map.get(amount);
        }

        int res=Integer.MAX_VALUE;
        for(int coin:coins){
            if(amount-coin>=0){
                int result=dfs(amount-coin, coins);
                if(result!=Integer.MAX_VALUE){
                    res=Math.min(res, 1+result);
                }
            }
        }

        map.put(amount, res);
        return res;
    }
    public int coinChange(int[] coins, int amount) {
        int mincoins=dfs(amount, coins);

        return mincoins==Integer.MAX_VALUE ? -1:mincoins;
    }
}
