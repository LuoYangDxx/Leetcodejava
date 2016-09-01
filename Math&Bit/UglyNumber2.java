public class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> num2List = new ArrayList<Integer>();
        List<Integer> num3List = new ArrayList<Integer>();
        List<Integer> num5List = new ArrayList<Integer>();
        num2List.add(1);
        num3List.add(1);
        num5List.add(1);
        
        int test = 0;

        for (int j = 0; j < n; j++) {
          //pick the min value  
          test = Math.min(Math.min(num2List.get(0), num3List.get(0)), num5List.get(0));
          //remove from one list
          if (num2List.get(0) == test) num2List.remove(0);
          if (num3List.get(0) == test) num3List.remove(0);
          if (num5List.get(0) == test) num5List.remove(0);
          //add the new value
          num2List.add(2 * test);
          num3List.add(3 * test);
          num5List.add(5 * test);
       }
       return test;
    }
}