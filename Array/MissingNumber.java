public class Solution {
    public int missingNumber(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
           while (nums[i] != i && nums[i] < nums.length) {
               int temp = 0;
               temp = nums[i];
               nums[i] = nums[nums[i]];
               nums[temp] = temp;
           }
       }
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] != i) return i;
       }
       return nums.length;
    }
}