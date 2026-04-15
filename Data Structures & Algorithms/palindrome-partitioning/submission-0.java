class Solution {
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public void helper(List<List<String>> list, List<String> temp, String s, int i){
        if(i>=s.length()){
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int j=i;j<s.length();j++){
            if(isPalindrome(s, i, j)){
                temp.add(s.substring(i, j+1));
                helper(list, temp, s, j+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        
        helper(list, temp, s, 0);

        return list;
    }
}
