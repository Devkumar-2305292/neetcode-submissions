class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk=new Stack<>();
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                stk.push(ch);
                count=Math.max(count, stk.size());
            }else if(ch==')'){
                stk.pop();
            }else{
                continue;
            }
        }

        return count;

    }
}