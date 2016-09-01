public class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (k >= len / 2) return quickSolve(prices);

        int[][] globle = new int[k + 1][len];
        for (int i = 1; i <= k; i++) {
            int local =  -prices[0];
            for (int j = 1; j < len; j++) {
                globle[i][j] = Math.max(globle[i][j - 1], prices[j] + local);   // globe : profit + price
                local =  Math.max(local, globle[i - 1][j - 1] - prices[j]);  // local : profit
            }
        }
        return globle[k][len - 1];
    }
    
    private int quickSolve(int[] prices) {
        int len = prices.length, profit = 0;
        for (int i = 1; i < len; i++)
            // as long as there is a price gap, we gain a profit.
            if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
        return profit;
    }
}