public class Solution {
      public void connect(TreeLinkNode root) {
        if (root == null) return;
        ArrayList<TreeLinkNode> cur = new ArrayList<TreeLinkNode>();
        cur.add(root);
        while (cur.size() != 0) {
            ArrayList<TreeLinkNode> next = new ArrayList<TreeLinkNode>();
            for (int i = 0; i < cur.size(); i++) {
                TreeLinkNode node = cur.get(i);
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
                if (i != cur.size() - 1) node.next = cur.get(i + 1);
            }
            cur = next;
        }
    }
}