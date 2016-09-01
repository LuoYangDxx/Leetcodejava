public class Solution {
    public int trap(int[] A) {
    if(A==null || A.length==0)  
    return 0;  
    int n = A.length;
    int res = 0;  
    int[] left = new int[A.length];
    int[] right = new int[A.length];
    for(int i=1;i< n;i++) {  
        left[i] = Math.max(left[i-1],A[i-1]);  
        right[n-1-i] = Math.max(right[n-i],A[n-i]);
    }  
    for(int i=0;i<n;i++)  
    {  
        int height=Math.min(left[i],right[i]);
        if(height>A[i])
        {
            res+=height - A[i];
        }
    }      
    return res;  
    }
}