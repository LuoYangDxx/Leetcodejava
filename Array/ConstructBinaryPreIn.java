public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       if(preorder.length==0||inorder.length==0) return null;
       return helper(0, preorder.length - 1, preorder, 0, inorder.length - 1, inorder); 
    }
    public TreeNode helper(int pStart, int pEnd, int[] preorder, int iStart, int iEnd, int[] inorder) {
        TreeNode root = new TreeNode(preorder[pStart]);
        int i;
        for (i = iStart; i <= iEnd; i++) {
            if (inorder[i] == preorder[pStart]) break;
        }
        int index = i - iStart;
        if (i > iStart) root.left = helper(pStart + 1, pStart + index, preorder, iStart, iStart + index - 1, inorder);
        if (i < iEnd) root.right = helper(pStart + index + 1, pEnd, preorder, iStart + index + 1, iEnd, inorder);
        return root;
    }
}