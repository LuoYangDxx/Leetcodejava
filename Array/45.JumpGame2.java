public class Solution {
    public int jump(int[] nums) {
        int step = 0;
        int max = 0;
        int last = 0;
        for (int i = 0; i <= max && i < nums.length; i++) {
            if (i > last) {
                step++;
                last = max;
            }
            max = Math.max(max, i + nums[i]);
        }
        if (max < nums.length - 1) return 0;
        return step;
    }
}