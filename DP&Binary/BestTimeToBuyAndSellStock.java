public class Solution {
    public int maxProfit(int[] prices) {
       int diff = 0;
       if (prices.length <= 0) return diff;
       int low = prices[0];
       for (int i = 0; i < prices.length; i++) {
           diff = Math.max(diff, prices[i] - low);
           low = Math.min(low, prices[i]);
       }
       return diff;
    }
}