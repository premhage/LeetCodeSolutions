class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int flag=0;
        int res[]=new int[2];
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
       return res;
    }
}