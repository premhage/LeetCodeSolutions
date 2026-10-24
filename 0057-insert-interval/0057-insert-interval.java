class Solution {
    public int[][] insert(int[][] arr, int[] newInterval) {
        int n = arr.length;
        int[][] res = new int[n + 1][2];

        int i = 0;
        int k = 0;

        while (i < n && arr[i][1] < newInterval[0]) {
            res[k++] = arr[i++];
        }

        while (i < n && arr[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(arr[i][0], newInterval[0]);
            newInterval[1] = Math.max(arr[i][1], newInterval[1]);
            i++;
        }

        res[k++] = newInterval;

        while (i < n) {
            res[k++] = arr[i++];
        }

        return java.util.Arrays.copyOf(res, k);
    }
}