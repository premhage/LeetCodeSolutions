class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while(low <= high){
            int mid = (low + high) / 2;
            if(sumOfD(nums,mid) <= threshold){
                high = mid - 1;
            }else
            low = mid + 1;
        }
        return low;
        
    }
    private int sumOfD(int[] arr,int div){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += (arr[i] + div - 1) / div;
        }
        return sum;
    }
}