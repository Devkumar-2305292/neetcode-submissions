class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=1;
        int product=1;

        for(int i=1;i<n;i++){
            product=product*nums[i-1];
            prefix[i]=product;
        }

        int[] suffix=new int[n];
        suffix[n-1]=1;
        product=1;

        for(int i=n-2;i>=0;i--){
            product=product*nums[i+1];
            suffix[i]=product;
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=prefix[i]*suffix[i];
        }

        return ans;
    }
}  
