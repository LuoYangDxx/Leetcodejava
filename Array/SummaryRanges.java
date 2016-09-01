public class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> res = new ArrayList<String>();
       if (nums.length == 0) return res;
       int start = 0;
       int end = 0;
       String temp = "";
       for (int i = 1; i < nums.length; i++) {
           if (nums[i - 1] + 1 != nums[i]) {
               end = i - 1;
               temp = "";
               if (start == end) {
                 temp += nums[start];   
               } else {
                 temp += nums[start] + "->" + nums[end];  
               }
               res.add(temp);
               start = i;
           } 
           end = i;
       }
       temp = "";
       if (start == end) {
         temp += nums[start];   
       } else {
         temp += nums[start] + "->" + nums[end];  
       }
       res.add(temp);
       return res;
    }
}