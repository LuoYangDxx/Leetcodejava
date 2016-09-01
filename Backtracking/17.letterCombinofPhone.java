public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits == null || digits.equals("")) return res;
        HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('0', new char[]{});
        map.put('1', new char[]{});
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        
        StringBuilder temp = new StringBuilder();
        helper(digits, res, map, temp, 0);
        return res;
    }
    public void helper (String digits, List<String> res, HashMap<Character, char[]> map, StringBuilder temp, int length) {
        if(temp.length() >= digits.length()) {
            res.add(temp.toString());
            return;
        } else {
            for (char c : map.get(digits.charAt(length))) {
                temp.append(c);
                helper(digits, res, map, temp, length + 1);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
        return;
    }
}