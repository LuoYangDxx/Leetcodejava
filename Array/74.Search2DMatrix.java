public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
       int n = matrix[0].length;
       int m = matrix.length;
       int end = m - 1;
       int start = 0;
       int mid = 0;
       while (start <= end) {
            mid = start + (end - start) / 2;
           if (matrix[mid][n - 1] < target) {
               start = mid + 1;
           } else if (matrix[mid][0] > target){
               end = mid - 1;
           } else break;
       }
       
       start = 0;
       end = n - 1;
       
       while (start <= end) {
           int mid1 = start + (end - start) / 2;
           if (matrix[mid][mid1] == target) return true;
           else if (matrix[mid][mid1] < target) {
               start = mid1 + 1;
           } else {
               end = mid1 - 1;
           }
       }
       return false;
    }
}