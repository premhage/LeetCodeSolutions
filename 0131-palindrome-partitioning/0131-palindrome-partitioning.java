class Solution {

    private void findPartitionss(String s, List<String> ls, List<List<String>> ans){
        if(s.length() == 0){
            ans.add(new ArrayList(ls));
            return;
        }
        for(int i = 0 ; i < s.length() ; i++){
            String part= s.substring(0,i+1);
            if(isPalindrome(part)){
                ls.add(part);
                findPartitionss(s.substring(i+1),ls,ans);
                ls.remove(ls.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        findPartitionss(s,new ArrayList<>(),ans);
        return ans;
    }
}