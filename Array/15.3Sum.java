public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      HashSet<List<Integer>> hashset = new HashSet<List<Integer>>();  
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      Arrays.sort(nums);
      for(int i = 0; i< nums.length - 2; i++) {
          int j = i + 1;
          int k = nums.length - 1;
          while(j < k) {
            if(nums[i] + nums[j] + nums[k] == 0) {
              List<Integer> current = new ArrayList<Integer>();
              current.add(nums[i]);
              current.add(nums[j]);
              current.add(nums[k]);
              if (!hashset.contains(current)) {
                 result.add(current); 
                 hashset.add(current);
              }
              j++;
              k--;
            } else if ((nums[i] + nums[j] + nums[k]) < 0) {
                j++;
            } else k--;
          }
        }
      return result;
    }
}