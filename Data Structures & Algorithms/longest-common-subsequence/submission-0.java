class Solution {
    public int helper(int i, int j, int n, int m, String text1, String text2, int[][] dp){
        if(i>=n || j>=m){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int match=0;
        if(text1.charAt(i)==text2.charAt(j)){
            match=1+helper(i+1, j+1, n, m, text1, text2, dp);
        }

        int notmatch=Math.max(helper(i+1, j, n, m, text1, text2, dp), helper(i, j+1, n, m, text1, text2, dp));

        dp[i][j]=Math.max(match, notmatch);
        return dp[i][j];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 0, n, m, text1, text2, dp);
    }
}
