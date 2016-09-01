public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        help(root);
        return root;
    }
    public void help(TreeNode root){
        if(root == null) return;
        TreeNode temp = new TreeNode(0);
        
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        if(root.left!=null) help(root.left);
        if(root.right!=null) help(root.right);
    }
}