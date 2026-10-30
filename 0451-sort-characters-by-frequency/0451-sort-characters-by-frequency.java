class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[256];

        int n = s.length();

        for(char ch : s.toCharArray()) {
            freq[ch]++;
        }

        StringBuilder str = new StringBuilder();

        for(int i = n; i >= 1; i--) {

            for(int j = 0; j < 256; j++) {

                if(freq[j] == i) {

                    for(int k = 0; k < i; k++) {
                        str.append((char)j);
                    }
                }
            }
        }

        return str.toString();
    }
}