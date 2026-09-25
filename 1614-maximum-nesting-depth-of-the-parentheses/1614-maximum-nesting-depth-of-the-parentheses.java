class Solution {
    public int maxDepth(String s) {
        int cnt = 0;
        int maxcnt = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                cnt++;
            }
            if(c == ')'){
                maxcnt = Math.max(cnt,maxcnt);
                cnt--;
            }
        }
        return maxcnt;
    }
}