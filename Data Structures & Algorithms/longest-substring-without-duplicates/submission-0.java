class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            int len=1;
            HashSet<Character> set=new HashSet<>();
            set.add(s.charAt(i));

            for(int j=i+1;j<n;j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    len++;
                }else{
                    break;
                }
            }

            max=Math.max(max, len);
        }

        return max;
    }
}
