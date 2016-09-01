public class Solution {
    public void nextPermutation(int[] nums) {
       for(int i = nums.length - 2; i>= 0; i--) {
           if(nums[i] < nums[i+1]) {
               for (int j = nums.length - 1; j > i; j--) {
                   if(nums[j] > nums[i]) {
                      swap(j,i,nums);
                      reverse(i+1, nums.length - 1, nums);
                      return;
                   }
               }
           }
       }
      reverse(0, nums.length - 1, nums); 
    }
    public void swap (int i, int j, int[] nums) {
       int temp = 0;
       temp = nums[j];
       nums[j] = nums[i];
       nums[i] = temp;
    }
    public void reverse (int i, int j, int[] nums) {
       while(i < j) {
           swap(i++,j--,nums);
       } 
    }
}