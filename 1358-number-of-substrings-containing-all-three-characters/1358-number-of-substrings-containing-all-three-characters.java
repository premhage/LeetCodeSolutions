class Solution {
    public int numberOfSubstrings(String s) {
        int lastseen[]=new int[3];
        int cnt = 0;
        Arrays.fill(lastseen,-1);

        for(int i = 0; i < s.length(); i++){
            lastseen[s.charAt(i) - 'a'] = i;

            cnt += (1 + Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2])));
        }

        return cnt;
    }
}