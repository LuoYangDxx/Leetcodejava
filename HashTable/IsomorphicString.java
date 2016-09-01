public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashSet<Character> set = new HashSet<Character>();
        if (s.length() != t.length()) return false;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (!map.containsKey(schar)) {
               if (set.contains(tchar)) return false;
               map.put(schar, tchar);
               set.add(tchar);
            } else {
               if (tchar != map.get(schar)) return false; 
            }
        }
        return true;
    }
}