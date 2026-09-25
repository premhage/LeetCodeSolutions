class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder s1=new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '(' && open++ > 0){
                s1.append(c);
            }
            if(c == ')' && open-- > 1){
                s1.append(c);
            }
        }
        return s1.toString();
    }
}