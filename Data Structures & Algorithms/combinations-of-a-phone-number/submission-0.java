class Solution {
    public void helper(String digits, List<String> ans, int index, HashMap<Character, String> map, StringBuilder sb){
        if(index==digits.length()){
            ans.add(sb.toString());
            return;
        }

        String letters=map.get(digits.charAt(index));

        for(int i=0;i<letters.length();i++){
            sb.append(letters.charAt(i));
            helper(digits, ans, index+1, map, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }

        HashMap<Character, String> map=new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        helper(digits, ans, 0, map, new StringBuilder());

        return ans;
    }
}
