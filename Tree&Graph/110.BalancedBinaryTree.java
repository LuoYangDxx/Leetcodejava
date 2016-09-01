public class Solution {
    public boolean isBalanced(TreeNode root) {
      if(root == null) return true;
      return (Math.abs(Depth(root.left) - Depth(root.right)) <=1)&&isBalanced(root.left)&&isBalanced(root.right);
    }
    public int Depth(TreeNode root){
       if(root == null) return 0;
       return Math.max(Depth(root.left)+1,Depth(root.right)+1);
    }
}