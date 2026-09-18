class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while(low <= high){
            int mid = (low + high)/2;
            if(daysReq(weights,mid) <= days){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    private int daysReq(int[] wt,int cap ){
        int day=1;
        int load = 0;

        for(int i= 0; i < wt.length ; i++){
            if(load + wt[i] > cap){
                day = day + 1;
                load = wt [i];
            }else{
                load += wt[i];
            }
        }
        return day;
    }
}