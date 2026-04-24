class Solution {
    public int helper(int left, int right, String s){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }

        return count;
    }

    public int countSubstrings(String s) {
        int ans=0;

        for(int i=0;i<s.length();i++){
            int even=helper(i, i+1, s);
            int odd=helper(i, i, s);

            ans=ans+even+odd;
        }

        return ans;
    }
}
