public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < m; i++) {
            if (!map.containsKey(nums1[i])) {
              map.put(nums1[i], 1);     
            } else {
              map.put(nums1[i], map.get(nums1[i]) + 1);   
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
              map.put(nums2[i], map.get(nums2[i]) - 1);
              result.add(nums2[i]);
            } 
        }
       int[] res = new int[result.size()];
       for (int i = 0; i < result.size(); i++) {
           res[i] = result.get(i);
       } 
       return res; 
    }
}