public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<List<String>>();
       HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
       for (int i = 0; i < strs.length; i++) {
           char[] c = strs[i].toCharArray();
           Arrays.sort(c);
           String s = new String(c);
           if (!map.containsKey(s)) {
               ArrayList<String> list = new ArrayList<String>();
               list.add(strs[i]);
               map.put(s,list);
           } else {
               map.get(s).add(strs[i]);
           }
       }
       for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
           res.add(entry.getValue());
       }
       return res;
    }
}