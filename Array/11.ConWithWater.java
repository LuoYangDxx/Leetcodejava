public class Solution {
  public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;
   
    while (left < right) {
       int curheight = Math.min(height[left], height[right]);
       int contains = curheight * (right - left);
       max = Math.max(max, contains);
      if(height[left] < height[right]) left++;
      else right--;
    }
    return max;
  }
}