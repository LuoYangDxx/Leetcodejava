public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        helper(res, temp, k, 1, n);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> temp, int k, int start, int n) {
        if (n < 0 || k < 0) return;
        else if (n == 0 && k == 0) res.add(new ArrayList(temp));
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            helper(res, temp, k - 1, i + 1, n - i);
            temp.remove(temp.size() - 1);
        }
        return;
    }
}