public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int m = words.length;
        int len = words[0].length();
        int n = s.length();
        if (n == 0) return res;
        
        for(String str : words) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        for (int i = 0; i < n - m * len + 1; i++) {
            HashMap<String, Integer> temp = new HashMap<String, Integer>(map);
            int index = i;
            while (index < i + m * len) {
               String str = s.substring(index, index + len);
               if (!temp.containsKey(str) || temp.get(str) == 0) break;
               temp.put(str, temp.get(str) - 1);
               index += len;
            }
            if (index == i + m * len) {
                res.add(i);
            }
        }
        return res;
    }
}