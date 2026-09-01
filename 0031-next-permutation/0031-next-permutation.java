class Solution {
    public void nextPermutation(int[] a) {
        int indx=-1;
        int n=a.length;

        for(int i=n-2 ; i>=0 ; i-- ){
            if(a[i] < a[i+1]){
                indx = i;
                break;
            }
        }
        if(indx==-1){
            reverse(a , 0 , n-1);
            return;
        }
        for(int i = n-1; i > indx ; i--){
            if(a[i] > a[indx]){
                swap(a , i , indx);
                break;
            }
        }

        reverse(a, indx+1 , n-1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}