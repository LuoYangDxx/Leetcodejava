public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        while(root != null){
            TreeLinkNode p = root;
            while(p != null)
            {
              if(p.left!=null)p.left.next = p.right;
              if(p.right!=null&p.next!=null) p.right.next = p.next.left;
               p=p.next;
            }
            root = root.left;
        }
    }
}