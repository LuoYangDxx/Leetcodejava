public class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
           if(nums[i] >= target) {
              res = i; 
              break;
           } 
        }
        if(target > nums[n - 1]) return n;
        return res;
    }
}