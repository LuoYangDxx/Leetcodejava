public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 0) return false;
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(nums[i])) {
                int diff = i - maps.get(nums[i]);
                if (diff <= k) return true;
            }
            maps.put(nums[i], i);
        }
        return false;
    }
}