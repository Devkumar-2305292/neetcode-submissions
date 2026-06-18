class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0 || n==1){
            return n;
        }
        int i=0;
        int max=Integer.MIN_VALUE;

        while(i<n-1){
            int j=i;
            HashSet<Character> set=new HashSet<>();
            int len=0;

            while(j<n && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                len++;
            }
            max=Math.max(max, len);
            i++;
        }

        return max;
    }
}
