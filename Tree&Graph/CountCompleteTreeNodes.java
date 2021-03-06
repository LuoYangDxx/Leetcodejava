public class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
           
        int left = countleft(root);
        int right = countright(root);
        
        if(left == right) {
          return (2<<(left)) - 1;
        }
        else {
          return countNodes(root.left)+countNodes(root.right)+1;
        }
    }
    public int countleft(TreeNode root){
        int count = 0;
        if(root == null) return 0;
        while(root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }
    public int countright(TreeNode root){
        int count = 0;
        if(root == null) return 0;
        while(root.right != null){
            count++;
            root = root.right;
        }
        return count;
    }
}