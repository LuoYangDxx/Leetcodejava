public class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int maxlocal = nums[0];
        int minlocal = nums[0];
        int global = nums[0];
        for (int i = 1; i<nums.length; i++) {
           int temp = maxlocal;
           maxlocal = Math.max(nums[i], Math.max(maxlocal*nums[i], minlocal*nums[i]));
           minlocal = Math.min(nums[i], Math.min(temp*nums[i], minlocal*nums[i]));
           global = Math.max(global, maxlocal);
        }
      return global;
    }
}