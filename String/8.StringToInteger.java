public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;
        str = str.trim();
        int positive = 1;
        long num = 0;
        int i = 0;
        
        if (str.charAt(i) == '+') {i++;}
        else if (str.charAt(i) == '-') {positive = -1; i++;}
        
        for(; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c > '9') || (c < '0')) break;
            num = num * 10 + c - '0';
            if (num >= Integer.MAX_VALUE) break;
        }
        if (positive < 0) {num = num * (-1);}
        if (num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)num;
    }
}