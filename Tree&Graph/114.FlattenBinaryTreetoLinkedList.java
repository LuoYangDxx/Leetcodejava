public class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
         TreeNode p = root;
        while(p!=null||!stack.isEmpty()) {
            if(p.right!=null){
                stack.push(p.right);
            }
            if(p.left!=null) {
                p.right = p.left;
                p.left = null;
            } else if(!stack.empty()) {
                TreeNode node = stack.pop();
                p.right = node;
            }
            p = p.right;
        }
    }
}