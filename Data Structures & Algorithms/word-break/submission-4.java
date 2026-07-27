class Solution {
    HashMap<Integer, Boolean> map;

    public boolean dfs(String s, List<String> wordDict, int i){
        if(map.containsKey(i)){
            return map.get(i);
        }

        for(String w:wordDict){
            if(i+w.length()<=s.length() && s.substring(i, i+w.length()).equals(w)){
                if(dfs(s, wordDict, i+w.length())){
                    map.put(i, true);
                    return true;
                }
            }
        }

        map.put(i, false);
        return false;


    }

    public boolean wordBreak(String s, List<String> wordDict) {
        map = new HashMap<>();
        map.put(s.length(), true);

        return dfs(s, wordDict, 0);
    }
}
