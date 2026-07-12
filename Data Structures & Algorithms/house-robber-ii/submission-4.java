class Solution {
    public int helper(int i, int[] arr, int[] dp){
        if(i>=arr.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        //take:
        int take=arr[i]+helper(i+2, arr, dp);

        //notTake:
        int notTake=helper(i+1, arr, dp);

        return dp[i]=Math.max(take, notTake);
    }

    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        
        int[] arr1=new int[n-1];
        int[] arr2=new int[n-1];

        int[] dp1=new int[n-1];
        int[] dp2=new int[n-1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        for(int i=0;i<n-1;i++){
            arr1[i]=nums[i];
        }

        for(int i=0;i<n-1;i++){
            arr2[i]=nums[i+1];
        }

        return Math.max(helper(0, arr1, dp1), helper(0, arr2, dp2));
    }
}
