public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashSet<String> set = new HashSet<String>();
        
        if (pattern.length() != strings.length) return false;
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s = strings[i];  
            if (map.containsKey(c)) {
              if (!s.equals(map.get(c))) return false;
            } else {
                if (set.contains(s)) return false;
                map.put(c,s);
                set.add(s);
            }
        }
        return true;
    }
}