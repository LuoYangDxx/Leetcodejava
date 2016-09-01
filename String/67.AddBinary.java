public class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int m = a.length() - 1;
        int n = b.length() - 1;
        int ca, cb;
        int carry = 0;
        while(m >= 0 && n >= 0) {
            ca = a.charAt(m) - '0';
            cb = b.charAt(n) - '0';
            int sum = (ca + cb + carry) % 2;
            carry = (ca + cb + carry) / 2;
            res = Integer.toString(sum) + res;
            m--;
            n--;
        }
        while (m >= 0) {
            ca = a.charAt(m) - '0';
            int sum = (ca + carry) % 2;
            carry = (ca + carry) / 2;
            res = Integer.toString(sum) + res;
            m--;
        }
        while (n >= 0) {
            cb = b.charAt(n) - '0';
            int sum = (cb + carry) % 2;
            carry = (cb + carry) / 2;
            res = Integer.toString(sum) + res;
            n--;
        }
        if (carry == 1) res = "1" + res;
        return res;
    }
}