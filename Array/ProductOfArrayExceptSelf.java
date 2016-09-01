public class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] output = new int[n];
       output[0] = 1;
       int left = 1;
       for (int i = 1; i < n; i++) {
          left *= nums[i - 1];
          output[i] = left;
       }
       int right = 1;
       for (int i = n - 2; i >= 0; i--) {
          right *= nums[i + 1];
          output[i] *= right;
       }
       return output;
    }
}