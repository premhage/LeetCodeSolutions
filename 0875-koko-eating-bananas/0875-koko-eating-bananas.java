class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while(low <= high){
            int mid = (low + high) / 2;
            long totalhr = reqTime(piles,mid);
            if(totalhr <= h){
                high = mid-1; 
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    private long reqTime(int[] arr,int h){
        long totalhr=0;
        for(int i=0;i<arr.length;i++){
           totalhr += (arr[i] + h - 1) / h;
        }
        return totalhr;
    }
}