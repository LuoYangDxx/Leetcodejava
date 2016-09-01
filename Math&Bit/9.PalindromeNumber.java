public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int result = 0;
        int p = x;
        while (p != 0) {
            result = result * 10 + p % 10;
            p /= 10;
        }
        return result == x;
    }
}