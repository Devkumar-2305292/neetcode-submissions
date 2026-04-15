class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int left=0, right=n-1;
        HashMap<Character, Integer> map1=new HashMap<>();

        for(int i=0;i<n;i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
        }

        while(right<s2.length()){
            HashMap<Character, Integer> map2=new HashMap<>();
            for(int i=left;i<=right;i++){
                map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
            }

            if(map2.equals(map1)){
                return true;
            }

            map2.clear();
            left++;
            right++;
        }

        return false;
    }
}
