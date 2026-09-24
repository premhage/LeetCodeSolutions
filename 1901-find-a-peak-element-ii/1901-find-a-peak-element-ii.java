class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = maxElement(matrix, n, m, mid);

            int left = (mid - 1 >= 0) ? matrix[row][mid - 1] : -1;
            int right = (mid + 1 < m) ? matrix[row][mid + 1] : -1;

            if (matrix[row][mid] > left && matrix[row][mid] > right) {
                return new int[]{row, mid};
            } 
            else if (matrix[row][mid] < left) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    private int maxElement(int[][] matrix, int n, int m, int col) {
        int maxRow = 0;
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] > matrix[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }
}