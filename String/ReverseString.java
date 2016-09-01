public class Solution {
    public String reverseString(String s) {
      char[] charArray = s.toCharArray();
        int halfLength = s.length() / 2;
        char temp;
        for (int i = 0; i < halfLength; i++) {
            temp = charArray[s.length() - 1 - i];
            charArray[s.length() - 1 - i] = charArray[i];
            charArray[i] = temp;
        }
        return new String(charArray);
    }
}