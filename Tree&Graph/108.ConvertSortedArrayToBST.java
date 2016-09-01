public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int end = nums.length-1;
        int start = 0;
        return helper(start,end,nums);
    }
    public TreeNode helper(int start, int end, int[]nums){
            if(start > end) return null;  
            int mid = (start+end)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(start,mid-1,nums);
            root.right = helper(mid+1,end,nums);
            return root;
    }
}