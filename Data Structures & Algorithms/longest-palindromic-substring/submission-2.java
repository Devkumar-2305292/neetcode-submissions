class Solution {
    public boolean isPalin(int i, int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        int start = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalin(i, j, s) && (j - i + 1) > maxLen) {
                    start=i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(start, start+maxLen);
    }
}
