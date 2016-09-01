public class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) red++;
            else if (nums[i] == 1) white++;
        }
        int j = 0;
        for (; j < nums.length; j++) {
            if (red <= 0) break;
            nums[j] = 0;
            red--;
        }
        for (; j < nums.length; j++) {
            if (white <= 0) break;
            nums[j] = 1;
            white--;
        }
        for (; j < nums.length; j++) {
            nums[j] = 2;
        }
    }
}