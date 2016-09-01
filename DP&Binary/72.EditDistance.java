public class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        int[][] dp = new int[n+1][m+1];
        dp[0][0] = 0;
        for(int i=1; i< m+1; i++){
            dp[0][i] = i; 
        }
        for(int i=1; i<n+1; i++){
            dp[i][0] = i;
        }
        
        for(int i = 1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                    //insert: dp[i][j-1] delete:dp[i-1][j] replace dp[i-1][j]
                }
            }
        }
        return dp[n][m];
    }
}