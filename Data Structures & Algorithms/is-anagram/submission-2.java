class Solution {
    public boolean isAnagram(String s, String t) {
        // int[] freq1=new int[26];
        // int[] freq2=new int[26];
        // Arrays.fill(freq1, 0);
        // Arrays.fill(freq2, 0);

        // for(int i=0;i<s.length();i++){
        //     freq1[s.charAt(i) - 'a']++;
        // }

        // for(int i=0;i<t.length();i++){
        //     freq2[t.charAt(i) - 'a']++;
        // }

        // for(int i=0;i<26;i++){
        //     if(freq1[i]!=freq2[i]){
        //         return false;
        //     }
        // }

        // return true;

        // HashMap<Character, Integer> map1=new HashMap<>();
        // HashMap<Character, Integer> map2=new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);//ch=r
        //     map1.put(ch, map1.getOrDefault(ch, 0)+1);
        // }

        // for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     map2.put(ch, map2.getOrDefault(ch, 0)+1);
        // }

        // return map1.equals(map2);

        char[] arr1=s.toCharArray();
        Arrays.sort(arr1);

        char[] arr2=t.toCharArray();
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
