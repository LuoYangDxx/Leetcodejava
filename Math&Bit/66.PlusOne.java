public class Solution {
    public int[] plusOne(int[] digits) {
       int reminder = 1;
       int sum = 0;
       for(int i = digits.length - 1; i >= 0; i--) {
           sum = reminder + digits[i];
           digits[i] = sum % 10;
           reminder = sum / 10;
       }
      if (reminder == 1) 
        {
         digits = new int[digits.length+1];
         digits[0]=1;
        }
     return digits;
    }
}