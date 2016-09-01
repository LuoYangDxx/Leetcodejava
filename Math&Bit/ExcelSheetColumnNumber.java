public class Solution {
    public int titleToNumber(String s) {
        char[] temp = s.toCharArray();
        int res = 0;
        int n = temp.length;
        for (int i = 0; i < n; i++) {
            int cur = (int)(temp[i] - 'A' + 1);
            res = res * 26 + cur;
        }
        return res;
    }
}