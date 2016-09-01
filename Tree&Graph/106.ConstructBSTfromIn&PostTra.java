public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) return null;
        return helper (0, postorder.length - 1, postorder, 0, inorder.length - 1, inorder);
    }
    public TreeNode helper(int pStart, int pEnd, int[] postorder, int iStart, int iEnd, int[] inorder) {
        TreeNode root = new TreeNode(postorder[pEnd]);
        int i;
        for (i = iStart; i <= iEnd; i++) {
            if (inorder[i] == postorder[pEnd]) break;
        }
        int index = i - iStart;
        if (i > iStart) root.left = helper(pStart, pStart + index - 1, postorder, iStart, iStart + index - 1, inorder);
        if (i < iEnd) root.right = helper(pStart + index, pEnd - 1, postorder, iStart + index + 1, iEnd, inorder);
        return root;
    }
}