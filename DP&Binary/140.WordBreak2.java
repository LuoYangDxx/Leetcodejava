public class Solution {
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        return wordBreakHelper(s,dict,map);
    }

    public ArrayList<String> wordBreakHelper(String s, Set<String> dict, Map<String, ArrayList<String>> res) {
        if (res.containsKey(s)) return res.get(s); //pruning cut
        
        ArrayList<String> result = new ArrayList<String>();
        int n = s.length();
        if(n <= 0) return result;
        for(int len = 1; len <= n; ++len) {
            String subfix = s.substring(0,len);
            if(dict.contains(subfix)) {
                if(len == n) {
                    result.add(subfix);
                } else {
                    String prefix = s.substring(len);
                    ArrayList<String> tmp = wordBreakHelper(prefix, dict, res);
                    for(String item:tmp) {
                        item = subfix + " " + item;
                        result.add(item);
                    }
                }
            }
        }
        res.put(s, result);
        return result;
    }
}