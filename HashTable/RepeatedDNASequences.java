public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        if (s.length() < 10) return res;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < s.length() - 10 + 1; i++) {
            String str = s.substring(i, i + 10);
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) res.add(entry.getKey());
        }
        return res;
    }
}