public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(num);
        dfs(res,tmp,num,target,0);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> tmp, int[] num, int target, int pos){
        if(target<0) return;
        if(target==0){
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i=pos; i<num.length;i++){
            tmp.add(num[i]);
            dfs(res,tmp,num,target-num[i],i+1);
            tmp.remove(tmp.size()-1);
            while(i<num.length-1&&num[i]==num[i+1]) i++; // or we can use hashset
        }
    }
}