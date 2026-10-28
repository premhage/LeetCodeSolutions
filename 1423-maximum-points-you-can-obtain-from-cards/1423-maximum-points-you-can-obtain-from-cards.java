class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum = 0;
        int rsum = 0;
        int sum = 0;

        for(int i = 0; i <= k-1; i++){
            lsum += nums[i];
        }
        sum = lsum;
        int rind = nums.length - 1;
        for(int i = k-1; i >= 0; i--){
            lsum -= nums[i];
            rsum += nums[rind];
            rind--;
            sum = Math.max(sum , lsum+rsum);
        }

        return sum;
    }
}