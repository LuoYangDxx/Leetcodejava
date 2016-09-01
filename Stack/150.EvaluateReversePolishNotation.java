public class Solution {
    public int evalRPN(String[] tokens) {
        String operators ="+-*/";
        Stack<String> stack = new Stack<String>();
        for(String str : tokens){
            if(!operators.contains(str)){
                stack.push(str);
            }
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(str);
                switch(index){
                  case 0: stack.push(String.valueOf(a+b));break;
                  case 1: stack.push(String.valueOf(b-a));break;
                  case 2: stack.push(String.valueOf(a*b));break;
                  case 3: stack.push(String.valueOf(b/a));break;
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }
}