public class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0)
        return null;
        
        int len1 = num1.length();
        int len2 = num2.length();
        int[] nums = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            int carry = 0;
            int a = num1.charAt(i) - '0';
            int j = len2 - 1;
            for (; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int value = a * b + carry + nums[i + j + 1];
                nums[i + j + 1] = value % 10;
                carry = value / 10;
            }
            nums[i + j + 1] = carry;
        }
       StringBuilder res = new StringBuilder();
       int k = 0;
       while (nums[k] == 0 && k < nums.length - 1) k++;
       while (k < nums.length) {
           res.append(nums[k]);
           k++;
       }
       return res.toString();
    }
}