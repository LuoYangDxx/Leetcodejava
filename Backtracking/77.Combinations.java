public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new  ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(n,k,1,res,temp);
        return res;
    }
    public void dfs(int n, int k, int pos, List<List<Integer>>res, List<Integer> temp){
        if (k < 0) return;
        else if (k == 0) {
            res.add(new ArrayList<Integer>(temp));
        }
        else {
            for(int i = pos;i <= n;i++) { 
            temp.add(i);
            dfs(n, k - 1, i + 1, res, temp);
            temp.remove(temp.size() - 1);
            }
        }
    }
}