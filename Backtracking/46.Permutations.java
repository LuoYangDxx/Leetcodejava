public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        int len = nums.length;
        boolean[] visited = new boolean[len];
        helper(res,temp,len,visited,nums);
       return res;
    }
    public void helper(List<List<Integer>> res,List<Integer> temp,int len,boolean[] visited,int[] nums) {
        if(len == 0) {
           res.add(new ArrayList(temp));
        }
        else {
           for (int i = 0;i<nums.length;i++) {
              if (!visited[i]) {
                temp.add(nums[i]);
                visited[i]=true;
                helper(res,temp,len-1,visited,nums);
                temp.remove(temp.size()-1);
                visited[i]=false;
              } 
           } 
        }
        return;
    }
}