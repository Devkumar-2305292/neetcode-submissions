class Solution {
    public int helper(int i, int j, String text1, String text2, int[][] dp){
        if(i>=text1.length() || j>=text2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int take=0;
        if(text1.charAt(i)==text2.charAt(j)){
            take=1+helper(i+1, j+1, text1, text2, dp);
        }
        int notTake1=helper(i+1, j, text1, text2, dp);
        int notTake2=helper(i, j+1, text1, text2, dp);

        return dp[i][j]=Math.max(take, Math.max(notTake1, notTake2));


    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, text1, text2, dp);
    }
}
