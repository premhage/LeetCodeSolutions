import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();

        int st  = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals){
            if(i[0] <= end){
                end = Math.max(i[1],end);
            }
            else{
                res.add(new int[]{st,end});
                st = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{st,end});

        return res.toArray(new int[0][]);
    }
}