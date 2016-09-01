public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(result,root,temp);
        return result;
    }
    public void dfs(List<String> result, TreeNode root,List<Integer> temp)
    {
        if(root == null) return;
        if(root.left==null&&root.right==null) {
            String temps = "";
            for(int i = 0;i<temp.size();i++) {
              temps += temp.get(i) +"->";
            }
            temps += root.val;
            result.add(temps);
        } 
        temp.add(root.val);
        dfs(result,root.left,temp);
        dfs(result,root.right,temp);
        temp.remove(temp.size()-1);
       return; 
    }
}