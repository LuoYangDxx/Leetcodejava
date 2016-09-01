public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        if (denominator == 0) return "";
        String result = "";
        
        if ((numerator < 0) ^ (denominator < 0)) result += "-";
        
        long num = numerator, den = denominator;
        num = Math.abs(num);
        den = Math.abs(den);
        
        long res = num / den;
        result += String.valueOf(res);
        
        long reminder = (num % den) * 10;
        if (reminder == 0) return result;
        result += ".";
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        while (reminder != 0) {
            if (map.containsKey(reminder)) {
               int end = map.get(reminder);
               String str1 = result.substring(0, end);
               String str2 = result.substring(end, result.length());
               result = str1 + "(" + str2 +")";
               return result;
            }
            map.put(reminder, result.length());
            res = reminder / den;
            result += String.valueOf(res);
            reminder = (reminder % den) * 10;
        }
        return result;
    }
}