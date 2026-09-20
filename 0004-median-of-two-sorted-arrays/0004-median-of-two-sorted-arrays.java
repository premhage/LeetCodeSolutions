import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList <Integer> l1=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            l1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            l1.add(nums2[i]);
        }
        Collections.sort(l1);
        int n=l1.size();

        if(n%2==1){
            return (l1.get(n/2));
        }
        
            return (l1.get(n / 2 - 1)+l1.get(n / 2)) / 2.0;
        
        
    }
}