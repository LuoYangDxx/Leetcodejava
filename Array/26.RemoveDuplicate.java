public class Solution {
    public int removeDuplicates(int[] nums) {
       int j = 1;
       if (nums.length <= 1) return j;
       for (int i = 1; i < nums.length; i++) {
          if(nums[i - 1] != nums[i]) {
             nums[j] = nums[i];
             j++;
          } 
       }
      return j;
    }
}