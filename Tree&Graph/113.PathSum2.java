public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        helper(res,temp,root,sum);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> temp, TreeNode root, int sum){
        if(root == null) return;
        temp.add(root.val);
        if(root.left == null && root.right == null) {
            if(sum == root.val) {
              res.add(new ArrayList(temp));
              temp.remove(temp.size()-1);  
              return;
            }
        }
       if(root.left!=null) helper(res,temp,root.left,sum - root.val);
       if(root.right!=null) helper(res,temp,root.right,sum - root.val);
       temp.remove(temp.size()-1);
       return;
    }
}