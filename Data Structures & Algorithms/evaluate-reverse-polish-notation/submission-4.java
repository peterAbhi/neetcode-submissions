class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer temp1, temp2;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp1+temp2);
            }
            else if(tokens[i].equals("-")){
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp2-temp1);
            }
            else if(tokens[i].equals("*")){
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp1*temp2);
            }
            else if(tokens[i].equals("/")){
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp2/temp1);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        System.out.println(stack);
        return stack.pop();
    }
}
