public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      if(root == null) return res;
      queue.add(root);
      while(!queue.isEmpty()) {
        int num = queue.size();
        List<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i<num;i++) {
          TreeNode node = queue.poll();
          if(node.left!=null) {queue.offer(node.left);}
          if(node.right!=null) {queue.offer(node.right);}
          temp.add(node.val);
        }
        res.add(new ArrayList<Integer>(temp));
      }
    return res;
  }
}