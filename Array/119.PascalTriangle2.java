public class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> res = new ArrayList<Integer>();
       List<Integer> preview = new ArrayList<Integer>();
       if (rowIndex < 0) return res;
       for (int j = 0; j <= rowIndex; j++) {
          res = new ArrayList<Integer>();
          res.add(1);
          for (int i = 1; i < j; i++) {
              int temp = preview.get(i - 1) + preview.get(i);
              res.add(temp);
          }
          if (j != 0) res.add(1);
          preview = new ArrayList<Integer>(res);
       }
       return res;
    }
}