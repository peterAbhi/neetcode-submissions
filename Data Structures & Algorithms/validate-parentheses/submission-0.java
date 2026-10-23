class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.add(s.charAt(i));
            }else if(s.charAt(i)=='(' && stack.get(stack.size()-1)==')'){
                stack.remove(stack.size()-1);
            }else if(s.charAt(i)=='{' && stack.get(stack.size()-1)=='}'){
                stack.remove(stack.size()-1);
            }else if(s.charAt(i)=='[' && stack.get(stack.size()-1)==']'){
                stack.remove(stack.size()-1);
            }else{
                stack.add(s.charAt(i));
            }
            System.out.println(stack);
        }
        if(stack.size()!=0){
            return false;
        }
        return true;
    }
}
