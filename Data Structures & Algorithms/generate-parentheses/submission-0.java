class Solution {
    public void helper(int n, List<String> list, StringBuilder s, int open, int close){
        if(s.length()==2*n){
            
            list.add(s.toString());
            return;
        }

        if(open<n){
            s.append('(');
            helper(n, list, s, open+1, close);
            s.deleteCharAt(s.length()-1);
        }

        if(close<open){
            s.append(')');
            helper(n, list, s, open, close+1);
            s.deleteCharAt(s.length()-1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        helper(n, list, s, 0, 0);

        return list;

    }
}
