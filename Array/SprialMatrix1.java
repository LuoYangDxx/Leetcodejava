public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> res = new ArrayList<Integer>();
       if(matrix.length == 0 || matrix[0].length == 0) return res;
       int m = matrix.length;
       int n = matrix[0].length;
       int nlvl = (Math.min(m,n)+1)/2;
       for(int i = 0; i<nlvl; i++) {
           int lastRow = m - i - 1;
           int lastCol = n - i - 1;
           if (lastRow == i) {
              for(int j = i; j <= lastCol; j++) {
                 res.add(matrix[i][j]); 
              } 
           } else if(lastCol == i) {
              for(int j = i; j <= lastRow; j++) {
                 res.add(matrix[j][i]); 
              } 
           } else {
             for(int j = i; j <lastCol; j++) {
               res.add(matrix[i][j]);
             }
             for(int j = i; j <lastRow; j++) {
               res.add(matrix[j][lastCol]);
             }
             for(int j = lastCol; j > i; j--) {
               res.add(matrix[lastRow][j]);
             }
             for(int j = lastRow; j > i; j--) {
               res.add(matrix[j][i]);
             }  
           }
       }
       return res;
    }
}