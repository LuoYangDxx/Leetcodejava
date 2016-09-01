public class Solution {
    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> temps = new ArrayList<String>();
        if(s == null||s.length()==0) return res;
        dfs(s, res, temps);
        return res;
    }
    public void dfs(String s, List<List<String>> res, List<String> temps)
    {
       if(s.length() == 0) {
           res.add(new ArrayList<String>(temps));return;
       }
       for (int i = 1; i<=s.length(); i++) {
          String temp = s.substring(0,i);
          if (isPalindrome(temp)) {
             temps.add(temp);
             temp = s.substring(i);
             dfs(temp, res, temps);
             temps.remove(temps.size()-1);
          }
       }
       return;
    }
    public boolean isPalindrome(String s) {
       if(s.length()==1) return true;
       int a = 0;
       int b = s.length()-1;
       while(a <= b) {
           if(s.charAt(a) != s.charAt(b)) return false;
           a++;
           b--;
       }
      return true;
    }
}