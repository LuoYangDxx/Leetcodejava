public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode cur = stack.pop();
        int res = cur.val;
        if (cur.right != null) {
            cur = cur.right;
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
        }
        return res;
    }
}