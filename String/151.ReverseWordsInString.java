public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        String result = "";
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].length() != 0) result += str[i] + " ";
        }
        result = result.trim();
        return result;
    }
}