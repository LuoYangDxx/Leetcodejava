public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> res = new ArrayList<List<Integer>>();
       Arrays.sort(nums);
       HashSet<List<Integer>> Set = new HashSet<>();
       for (int i = 0; i < nums.length - 3; i++) {
           for (int j = i + 1; j < nums.length - 2; j++) {
               int l = j + 1;
               int k = nums.length - 1;
               while (l < k) {
                 int cur = nums[i] + nums[j] + nums[l] + nums[k];
                 if (cur == target) {
                     List<Integer> temp = new ArrayList<Integer>();
                     temp.add(nums[i]);
                     temp.add(nums[j]);
                     temp.add(nums[l]);
                     temp.add(nums[k]);
                     if (!Set.contains(temp)) {
                       res.add(new ArrayList<Integer>(temp));  
                       Set.add(temp);
                     }
                     l++;
                     k--;
                 } else if (cur < target) {
                     l++;
                 } else {
                     k--;
                 }
               }
           }
       } 
       return res;
    }
}