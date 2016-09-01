public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        HashSet<List<Integer>> hashset = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        helper(res, temp, nums, 0, hashset);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, int pos, HashSet<List<Integer>> hashset) {
        if (!hashset.contains(temp)) {
          res.add(new ArrayList(temp));
          hashset.add(temp);
        }
        for(int i = pos; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(res, temp, nums, i + 1, hashset);
            temp.remove(temp.size() - 1);
        }
    }
}