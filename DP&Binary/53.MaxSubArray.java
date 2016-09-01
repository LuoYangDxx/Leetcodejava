public class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
       if (n <= 0) return 0;
       int sum = nums[0];
       int currentSum = nums[0];
       for (int i = 1; i < n; i++) {
          if(currentSum <= 0) currentSum = 0;
          currentSum += nums[i];
          sum = Math.max(sum, currentSum);
       }
      return sum;
    }
}