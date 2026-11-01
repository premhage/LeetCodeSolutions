
class Solution {
    public String minWindow(String s, String t) {

        int minlen = Integer.MAX_VALUE;
        int sIndex = -1;

        int hash[] = new int[256];

        int l = 0;
        int r = 0;

        int n = s.length();
        int m = t.length();

        int cnt = 0;

        for(int i = 0; i < m; i++){
            hash[t.charAt(i)]++;
        }

        while(r < n){

            if(hash[s.charAt(r)] > 0){
                cnt++;
            }

            hash[s.charAt(r)]--;

            while(cnt == m){

                if((r - l + 1) < minlen){
                    minlen = r - l + 1;
                    sIndex = l;
                }

                hash[s.charAt(l)]++;

                if(hash[s.charAt(l)] > 0){
                    cnt--;
                }

                l++;
            }

            r++;
        }

        return sIndex == -1 ? "" :
               s.substring(sIndex, sIndex + minlen);
    }
}
