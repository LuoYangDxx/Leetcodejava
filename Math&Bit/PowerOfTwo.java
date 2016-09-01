public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            sum += (n >> i) & 1;
            if (sum > 1) return false;
        }
        return true;
    }
}