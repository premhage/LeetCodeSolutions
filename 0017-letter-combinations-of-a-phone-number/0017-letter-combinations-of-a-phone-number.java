class Solution {
    String map[]={
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    private void findCombinations(String no, int index, StringBuilder current, List<String> ans){
        if(index == no.length()){
            ans.add(current.toString());
            return;
        }
        String letters = map[no.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            current.append(ch);                  
            findCombinations(no, index + 1, current, ans); 
            current.deleteCharAt(current.length() - 1); 
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return result;

        findCombinations(digits, 0, new StringBuilder(), result);
        return result;
    }
}