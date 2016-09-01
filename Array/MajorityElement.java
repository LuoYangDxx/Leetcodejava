public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if (n <= 0) return 0;
        int res = nums[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
           if (nums[i] == res) {
               count++;
           } else {
               if (count <= 0) {
                  res = nums[i];
                  count++;
               } else count--;
           }
        }
      return res;
    }
}