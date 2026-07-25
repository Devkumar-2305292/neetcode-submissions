class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int count=0;
        int i=0;
        int x=money;

        while(count!=2 && i<prices.length){
            if(money>=prices[i]){
                count++;
                money=money-prices[i];
            }
            i++;
        }

        return count==2 ? money : x;
        
    }
}