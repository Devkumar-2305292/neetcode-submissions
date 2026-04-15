class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] rightMax=new int[n];
        rightMax[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], prices[i+1]);
        }

        int max=0;
        for(int i=0;i<n;i++){
            int profit=rightMax[i]-prices[i];
            max=Math.max(max, profit);
        }

        return max;
    }
}
