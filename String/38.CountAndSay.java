public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String res = "";
        Queue<String> queue = new LinkedList<String>();
        queue.add("1");
        while (n > 1 && !queue.isEmpty()) {
          String s = queue.poll();  
          int count = 1;
          res = "";
          for (int i = 1; i < s.length(); i++) {
              if (s.charAt(i - 1) == s.charAt(i)) count++;
              else {
                  res += String.valueOf(count) + s.charAt(i - 1);
                  count = 1;
              }
          }
          res += String.valueOf(count) + s.charAt(s.length() - 1);
          queue.add(res);
          n--;
        }
        return res;
    }
}