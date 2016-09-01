public class Codec {
    // Encodes a tree to a single string.
   public String serialize(TreeNode root) {
        // write your code here
        if(root == null) return "# ";
        String rnt = new String();
        rnt += (root.val + " ");
        rnt += serialize(root.left);
        rnt += serialize(root.right);
        return rnt;
    }
    public TreeNode deserialize(String data) {
        // write your code here
        String[] str = data.split(" ");
        int[] index = new int[1];
        return helpDeserial(str, index);
        
    }
    
    public TreeNode helpDeserial(String[] str, int[] index){
        String curr = str[index[0]];
        if(curr.equals("#")){
            index[0]++;
            return null;
        } else{
            TreeNode node = new TreeNode(Integer.parseInt(curr));
            index[0]++;
            node.left = helpDeserial(str, index);
            node.right = helpDeserial(str, index);
            return node;
        }
    }
}