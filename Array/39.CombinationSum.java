public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        helper(res,temp,0,candidates,target);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> temp, int start, int[] candidates, int target) {
        if(target == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
       if(target < 0) {return;}
       else {
           for(int i = start; i < candidates.length; i++) {
               temp.add(candidates[i]);
               helper(res,temp,i,candidates,target - candidates[i]);
               temp.remove(temp.size()-1);
           }
       }
       return;
    }
}