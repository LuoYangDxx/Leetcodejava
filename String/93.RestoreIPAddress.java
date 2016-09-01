public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        String temp = "";
        dfs(res, temp, 4, s);
        return res;
    }
    public void dfs(List<String> res, String temp, int len, String s) {
        if (len == 0 && s.length() == 0) res.add(temp);
        else if (len > 0) {
            for (int i = 0; i < Math.min(3, s.length()); i++) {
                if (i > 0 && s.charAt(0) == '0') continue;
                if (Integer.parseInt(s.substring(0, i + 1)) <= 255) {
                    String backup = temp;
                    temp += (len < 4 ? "." : "") + s.substring(0, i + 1);
                    dfs(res, temp, len - 1, s.substring(i + 1));
                    temp = backup;
                }
            }
        }
        return;
    }
}