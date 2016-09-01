public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        //xor == A ^ B
        int lastBit = xor - (xor & (xor - 1));
        //A, B is different, find the kth bit A different from B,
        //because xor == A ^ B, so we just need to find the bit where in xor is 1.
        int group0 = 0, group1 = 0;
        for (int i = 0; i < nums.length; i++) {//if we find the different between A and B, we can divide it to two subarray
        //group0 and group1, then we transform the question to single number 1.
            if ((lastBit & nums[i]) == 0) {
                group0 ^= nums[i];
            } else {
                group1 ^= nums[i];
            }
        }
        
        int[] result = new int[2];
        result[0] = group0;
        result[1] = group1;
        return result;
    }
}