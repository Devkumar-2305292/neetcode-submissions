class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        int[] visited=new int[strs.length];
        Arrays.fill(visited, 0);

        for(int i=0;i<strs.length;i++){
            HashMap<Character, Integer> map1=new HashMap<>();
            List<String> sub=new ArrayList<>();
            if(visited[i]==1){
                continue;
            }
            sub.add(strs[i]);
            visited[i]=1;

            for(int j=0;j<strs[i].length();j++){
                char ch=strs[i].charAt(j);
                map1.put(ch, map1.getOrDefault(ch, 0)+1);
            }

            

            for(int k=i+1;k<strs.length;k++){
                if(visited[k]==1){
                    continue;
                }

                HashMap<Character, Integer> map2=new HashMap<>();
                

                for(int j=0;j<strs[k].length();j++){
                    char ch=strs[k].charAt(j);
                    map2.put(ch, map2.getOrDefault(ch, 0)+1);
                }

                if(map1.equals(map2)){
                    sub.add(strs[k]);
                    visited[k]=1;
                }

            }

            ans.add(sub);
        }

        return ans;
    }
}
