public class Solution {
    public int nthUglyNumber(int n) {
    if(n<=0) return 0;
 
      ArrayList<Integer> list = new ArrayList<Integer>();
      int[] result = new int[n];
      result[0] = 1;
 
      int i=0;
      int j=0;
      int k=0;
 
     for (int index = 1; index < n; index++) {
         
         int m2 = result[i]*2;
         int m3 = result[j]*3;
         int m5 = result[k]*5;
 
        int min = Math.min(m2, Math.min(m3, m5));
        result[index] = min;
 
        if(min==m2) i++;
        if(min==m3) j++;
        if(min==m5) k++;
     }
     
     return result[n - 1];
    }
}