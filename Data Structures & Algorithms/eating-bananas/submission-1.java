class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=piles[0];

        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        int min=Integer.MAX_VALUE;
        int low=1, high=max;
        while(low<=high){
            int k=low+(high-low)/2;
            int hour=0;
            for(int i=0;i<n;i++){
                hour += (piles[i] + k - 1) / k;
            }
            
            if(hour<=h){
                min=Math.min(min, k);
                high=k-1;
            }else{
                low=k+1;
            }
        }

        return min;
    }
}
