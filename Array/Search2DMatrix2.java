public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        return helper(matrix, target, 0, m - 1, 0, n - 1); 
    }
    public boolean helper(int[][] matrix, int target, int rowStart, int rowEnd, int colStart, int colEnd) {
        
        if(rowStart > rowEnd || colStart > colEnd){
            return false;
        }
        int mid1 = rowStart + (rowEnd - rowStart) / 2;
        int mid2 = colStart + (colEnd - colStart) / 2;
        
        if(matrix[mid1][mid2] == target) {
            return true;
        } else if (matrix[mid1][mid2] < target) {
            return helper(matrix, target, mid1 + 1, rowEnd, mid2 + 1, colEnd)||
                   helper(matrix, target, rowStart, mid1, mid2 + 1, colEnd) || 
                   helper(matrix, target, mid1 + 1, rowEnd, colStart, mid2) ;
        } else {
            return helper(matrix, target, rowStart, mid1 - 1, colStart, mid2 - 1) ||
                   helper(matrix, target, rowStart, mid1 - 1, mid2, colEnd) || 
                   helper(matrix, target, mid1, rowEnd, colStart, mid2 - 1) ;
        }
    }
}