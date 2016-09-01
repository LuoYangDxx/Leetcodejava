public class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> res = new ArrayList<List<Integer>>();
      
       if (numRows <= 0) return res;
       
       for (int j = 0; j < numRows; j++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int i = 1; i < j; i++) {
                List<Integer> preview = res.get(j - 1);
                int temp = preview.get(i - 1) + preview.get(i);
                row.add(temp);
            }
           if (j != 0) row.add(1);
           res.add(row);
       }
      return res;  
    }
}