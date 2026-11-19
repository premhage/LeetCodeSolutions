class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findSubArray(nums, k) - findSubArray(nums, k - 1);
    }

    private int findSubArray(int[] nums, int k) {

        if (k < 0) return 0;

        int l = 0;
        int cnt = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {

            mpp.put(nums[r], mpp.getOrDefault(nums[r], 0) + 1);

            while (mpp.size() > k) {

                mpp.put(nums[l], mpp.get(nums[l]) - 1);

                if (mpp.get(nums[l]) == 0) {
                    mpp.remove(nums[l]);
                }

                l++;
            }

            cnt += (r - l + 1);
        }

        return cnt;
    }
}
