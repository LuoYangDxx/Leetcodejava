public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<List<Integer>>();
       List<Integer> temp = new ArrayList<Integer>();
       Arrays.sort(nums);
       helper(res, temp, nums, 0);
       return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, int position) {
        res.add(new ArrayList<Integer>(temp));
        for(int i = position; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}