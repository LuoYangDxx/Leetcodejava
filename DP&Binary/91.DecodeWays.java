public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        int res[] = new int[s.length() + 1];
        res[0] = 1;
        
        if (isValid(s.substring(0, 1))) res[1] = 1;
        else res[1] = 0;
        
        for (int i = 2; i < res.length; i++) {
            if (isValid(s.substring(i - 1, i))) {
               res[i] += res[i - 1]; 
            }
            if (isValid(s.substring(i - 2, i))) {
               res[i] += res[i - 2]; 
            }
        }
        return res[s.length()];
    }
    public boolean isValid (String number) {
        if (number.charAt(0) == '0') return false;
        int num = Integer.parseInt(number);
        if (num > 0 && num <= 26) return true;
        return false;
    }
}