public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricTree(root.left,root.right);
    }
    public boolean isSymmetricTree(TreeNode a,TreeNode b){
        if(a==null&&b==null) return true;
        if(a==null||b==null) return false;
        if(a.val!= b.val) return false;
        return isSymmetricTree(a.left,b.right)&&isSymmetricTree(b.left,a.right);
    }
}