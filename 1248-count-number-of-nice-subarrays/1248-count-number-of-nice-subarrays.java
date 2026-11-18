class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return findSubArray(nums,k) - findSubArray(nums,k-1);
    }
    private int findSubArray(int[] nums, int k){
        int l =0;
        int r = 0;
        int cnt = 0;
        int sum = 0;

        while(r < nums.length){
            sum += nums[r] % 2;

            while(sum > k){
                sum -= nums[l] % 2;
                l++;
            }
            cnt += (r - l + 1);
            r++;
        }
        return cnt;
    }
}