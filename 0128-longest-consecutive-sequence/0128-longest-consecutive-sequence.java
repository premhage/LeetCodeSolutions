class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest=1;

        if(n==0){
            return 0;
        }

        Set<Integer> st=new HashSet<>();

        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        for(int i : st){
            if(!st.contains(i-1)){
                int x = i;
                int cnt = 1;

                while(st.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                } 
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}