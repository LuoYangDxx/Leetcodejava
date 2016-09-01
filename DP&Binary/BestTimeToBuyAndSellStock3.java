public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1){
            return 0;
        }
         
        int max = 0;
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
         
        getMaxProfit(prices,left,right);
        for(int i = 0; i < prices.length; i++) {
            max = Math.max(max, left[i] + right[i]);
        }
        return max;
    }
     
    public void getMaxProfit(int[] prices, int[] left, int[] right){
        left[0] = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            left[i] = Math.max(left[i-1], prices[i]-min);
            min = Math.min(prices[i], min);
        }
         
        right[prices.length-1] = 0;
        int max = prices[prices.length-1];
        for(int i = prices.length - 2; i >= 0; i--){
            right[i] = Math.max(right[i+1], max - prices[i]);
            max = Math.max(prices[i], max);
        }
    }
} 