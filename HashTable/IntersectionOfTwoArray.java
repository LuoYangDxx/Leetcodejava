public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> settwo = new HashSet<Integer>();
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < m; i++) {
            set.add(nums1[i]); 
        }
        
        for (int j = 0; j < n; j++) {
            if (set.contains(nums2[j])) {
                settwo.add(nums2[j]);
            }
        }
        int len = settwo.size();
        int[] res = new int[len];
        int i = 0;
        for(Integer num : settwo) {
            res[i] = num;
            i++;
        }
       return res; 
    }
}