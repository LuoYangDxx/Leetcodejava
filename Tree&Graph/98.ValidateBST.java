public class Solution {
    public boolean isValidBST(TreeNode root) {
        long a = Long.MAX_VALUE;
        long b = Long.MIN_VALUE;
        return rec(a,b,root);
    }
    public boolean rec(long a,long b, TreeNode root){
        if(root == null) return true;
        if(root.val<=b||root.val>=a) return false;
        return rec(root.val,b,root.left)&&rec(a,root.val,root.right);
    }
}