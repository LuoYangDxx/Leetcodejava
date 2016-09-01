public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[] dp = new int[n];
        for (int i = m - 1; i >= 0; i--) {
           n = triangle.get(i).size();
           for (int j = 0; j < n; j++) {
               if (i == m - 1) {
                   dp[j] = triangle.get(i).get(j);
               } else {
                   dp[j] = Math.min(dp[j + 1], dp[j]) + triangle.get(i).get(j);
               }
           } 
        }
        return dp[0];
    }
}