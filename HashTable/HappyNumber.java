public class Solution {
    public boolean isHappy(int n) {
       int m = n;
       HashSet<Integer> set = new HashSet<Integer>();
       while (m != 1) {
          int sum = 0;
          while (m > 0) {
              int temp = m % 10;
              sum += temp * temp;
              m /= 10;
          }
          m = sum;
          if(!set.contains(m)) set.add(m);
          else break;
       }
       if (m == 1) return true;
       else return false;
    }
}