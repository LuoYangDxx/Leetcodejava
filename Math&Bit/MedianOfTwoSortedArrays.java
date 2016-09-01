public class Solution {
   public double findMedianSortedArrays(int A[], int B[]) {
        int lenA = A.length;
        int lenB = B.length;
        if((lenA + lenB) % 2 == 0){
        	int r1 = findKth(A, 0, lenA, B, 0, lenB, (lenA + lenB) / 2); // check odd or even
        	int r2 = findKth(A, 0, lenA, B, 0, lenB, (lenA + lenB) / 2 + 1);
        	return (double) (r1 + r2) / 2;
        }
        else{return findKth(A, 0, lenA, B, 0, lenB, (lenA + lenB + 1) / 2);}
    }
    
    public int findKth(int[] A, int startA, int endA, int[] B, int startB, int endB, int k){
    	if(startA >= endA) {return B[startB + k - 1];}
    	if(startB >= endB) {return A[startA + k - 1];}
    	
    	if(k == 1) {return Math.min(A[startA], B[startB]);}
    	int m = endA - startA;
    	int n = endB - startB;
    	int midA = (endA + startA) / 2;
    	int midB = (endB + startB) / 2;
    	
    	if(A[midA] > B[midB]){
    		if (k > m/2 + n/2 + 1) {
    			return findKth(A, startA, endA, B, midB + 1, endB, k - n/2 - 1);
    			//when k is bigger, need to cut, k-n/2-1 need to cut the mid
    		}                                 
    		else {return findKth(A, startA, midA, B, startB, endB, k);}
    	}
    	else {
    		if (k > m/2 + n/2 +1) {return findKth(A, midA + 1, endA, B, startB, endB, k - m / 2 - 1);}
    		else {return findKth(A, startA, endA, B, startB, midB, k);}
    	}
    }
}