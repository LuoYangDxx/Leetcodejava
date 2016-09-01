public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {  
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {   return res;  }  
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean flage = false;
        while(!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<Integer>();
            int num = queue.size();
            for(int i = 0;i<num;i++) {
             TreeNode node = queue.poll();
             temp.add(node.val);
             if(node.left!=null) queue.offer(node.left);
             if(node.right!=null) queue.offer(node.right);
            }
            if(flage) {Collections.reverse(temp);flage = false;}
            else flage = true;
            res.add(new ArrayList<Integer>(temp));
        }
        return res;
    }
} 