public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> temp = new ArrayList<Integer>();
            int num = queue.size();
            for(int i= 0;i<num;i++)
            {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }
}