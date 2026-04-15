class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }

        int[] arr1=new int[26];
        int[] arr2=new int[26];

        Arrays.fill(arr1, 0);
        Arrays.fill(arr2, 0);

        for(int i=0;i<n;i++){
            arr1[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<m;i++){
            arr2[t.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(arr1[i]==arr2[i]){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
