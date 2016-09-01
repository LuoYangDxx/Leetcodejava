public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        int mid = (nums.length + 1) / 2, end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            temp[i] = (i & 1) == 0 ?  nums[--mid] : nums[end--] ;
        }
 
        for (int i = 0; i < nums.length; i++)
            nums[i] = temp[i];
    }
}