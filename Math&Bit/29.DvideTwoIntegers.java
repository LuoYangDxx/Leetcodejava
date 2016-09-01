public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 0) return dividend >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        
        int neg = -1;
        if (dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0) {
            neg = 1;
        }
        int result = 0;
        while (a >= b) {
            int shift = 0;
            while (a >= b<<shift) {
                shift++;
            }
            a -= b << (shift - 1);
            result += 1 << (shift - 1);
        }
        result *= neg;
        return result;
    }
}