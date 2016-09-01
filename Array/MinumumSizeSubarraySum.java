public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
       int result = nums.length + 1;
       int j = 0;
       int sum = 0;
       for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
           while (sum >= s) {
              result = Math.min(result, i - j + 1);
              sum -= nums[j];
              j++;
           }
       }
       if (result == nums.length + 1) return 0;
       return result;
    }
}