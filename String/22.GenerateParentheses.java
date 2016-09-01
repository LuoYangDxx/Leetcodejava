public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        String s = "";
        dfs(res, s, n, n);
        return res;
    }
    public void dfs(List<String> res, String s, int left, int right) {
        if (left > right) return;
        if (left == 0 && right == 0) {res.add(s);return;}
        if (left > 0) {
           s += "(";
           dfs(res, s, left - 1, right);
           s = s.substring(0, s.length() - 1);
        }
        if (right > 0){
           s += ")";
           dfs(res, s, left, right - 1);
           s = s.substring(0, s.length() - 1);
        }
        return;
    }
}