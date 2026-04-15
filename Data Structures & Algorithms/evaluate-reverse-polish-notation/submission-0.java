class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];

            switch(ch){
                case "+":
                int a=stk.pop();
                int b=stk.pop();
                stk.push(a+b);
                break;

                case "-":
                a=stk.pop();
                b=stk.pop();
                stk.push(b-a);
                break;

                case "*":
                a=stk.pop();
                b=stk.pop();
                stk.push(a*b);
                break;

                case "/":
                a=stk.pop();
                b=stk.pop();
                stk.push(b/a);
                break;

                default:
                stk.push(Integer.parseInt(ch));
                break;
            }
        }

        return stk.peek();
    }
}
