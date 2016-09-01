public class Solution {
    public int[][] generateMatrix(int n) {
       int[][] result = new int[n][n];
       int res = 1;
       for(int i = 0; i <= n/2; i++) {
           int last = n - i - 1;
           for(int j = i; j < last; j++) {
               result[i][j] = res++;
           }
           for(int j = i; j < last; j++) {
               result[j][last] = res++;
           }
           for(int j = last; j > i; j--) {
               result[last][j] = res++;
           }
           for(int j = last; j > i; j--) {
               result[j][i] = res++;
           }
       }
       if(n%2 != 0) {
           result[n/2][n/2] = res;
       }
       return result;
    }
}