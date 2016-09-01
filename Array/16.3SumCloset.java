public class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int n = nums.length;
       int res = nums[0] + nums[1] + nums[2];
       int diff = Math.abs(target - res);
       Arrays.sort(nums);
       for (int i = 0; i < n - 2 ; i++) {
          int j = i + 1;
          int k = n - 1;
          while (j < k) {
              int cur_res = nums[i] + nums[j] + nums[k];
              int new_diff = Math.abs(target - cur_res);
              if (new_diff < diff) {
                  diff = new_diff;
                  res = cur_res;
              }
              if (cur_res < target) {
                j++;  
              } else k--;
          }
       }
      return res;
    }
}