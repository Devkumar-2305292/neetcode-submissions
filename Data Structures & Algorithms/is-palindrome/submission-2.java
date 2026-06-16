class Solution {
    public boolean isPalindrome(String s) {
        String result=s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        int n=result.length();

        int i=0;
        while(i<n/2){
            if(result.charAt(i)!=result.charAt(n-i-1)){
                return false;
            }
            i++;
        }

        return true;
    }
}
