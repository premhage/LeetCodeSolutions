class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        while(low <= high){
            int mid = (low + high)/2;
            if(possible(bloomDay,mid,m,k)==false){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }

    private boolean possible(int[] arr,int day,int m ,int k){
        int cnt=0;
        int boquets=0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] <= day){
                cnt++;
            }
            else{
                boquets += (cnt/k);
                cnt=0;
            }
        }
        boquets += (cnt/k);

        if(boquets >= m){
            return true;
        }
        return false;

    }
}