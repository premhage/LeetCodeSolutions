class Solution {


    public int countSubarrays(int[] nums, int maxSum) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                count++;
                currentSum = num;
            }
        }
        return count;
    }

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        // Define search space
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;              
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int parts = countSubarrays(nums, mid);

            if (parts > k) {
                low = mid + 1;   
            } else {
                high = mid - 1;  
            }
        }

        return low;
    }
}