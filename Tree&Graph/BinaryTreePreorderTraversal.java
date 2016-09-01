public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        helper(res,root);
        return res;
    }
    public void helper(List<Integer> res,TreeNode root){
        if(root==null) return;
        res.add(root.val);
        if(root.left!=null)  helper(res,root.left);
        if(root.right!=null) helper(res,root.right);
    }
}