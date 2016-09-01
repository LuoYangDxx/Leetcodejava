public class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {  
        List<List<Integer>> result = new ArrayList<List<Integer>>();  
        List<Integer> temp  = new ArrayList<Integer>();  
        boolean[] visited = new boolean[num.length];  
        Arrays.sort(num);
        helper(num, result, temp, visited);  
        return result;  
    }  
      
    public void helper(int[] num, List<List<Integer>> result, List<Integer> temp, boolean[] visited) {  
        if (temp.size() == num.length) {  
            // duplicate element and add it to result (element would be changed from time to time. If directly use element  
            // only result would be changed when element changed)  
            result.add(new ArrayList<Integer>(temp));   
            return;  
        }  
          
        for(int i=0; i<num.length; i++) {  
            if(!visited[i]) {  
                visited[i] = true;  
                temp.add(num[i]);  //if not visit, add the num[] into element, just like 1,2,3 1,3,2 , 1 is add
                helper(num, result, temp, visited);  
                // After providing a complete permutation, pull out the last number,   
                temp.remove(temp.size()-1);  
                visited[i] = false;  
                while(i<num.length-1&&num[i]==num[i+1]) i++;
            }  
        }  
        return;
    }  
}