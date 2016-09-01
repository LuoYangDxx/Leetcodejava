public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = m == 0 ? 0 : matrix[0].length;
        int[][] height = new int[m][n + 1];
        
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0') {
                    height[i][j] = 0;
                } else {
                    height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            int area = maxAreaInHist(height[i]);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
    public int maxAreaInHist(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int max = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
                stack.push(i++);
            } else {
                int p = stack.pop();
    			int h = height[p];
    			int w = stack.isEmpty() ? i : i - 1 - stack.peek();
    			max = Math.max(h * w, max);
            }
        }
        while (!stack.isEmpty()) {
    		int p = stack.pop();
    		int h = heights[p];
    		int w = stack.isEmpty() ? i : i - 1 - stack.peek();
    		max = Math.max(h * w, max);
    	}
        return max;
    }
}