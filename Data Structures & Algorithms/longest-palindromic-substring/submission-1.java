class Solution {
    public String helper(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }

    public String longestPalindrome(String s) {
        String ans="";
        
        for(int i=0;i<s.length();i++){
            String even=helper(s, i, i+1);
            String odd=helper(s, i, i);

            if(ans.length()<even.length()){
                ans=even;
            }
            if(ans.length()<odd.length()){
                ans=odd;
            }
        }

        return ans;
    }
}
