public class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1, high = num / 2;  
        if(num == 1) return true;  
        long x = num;  
        while(low <= high) {  
            long mid = lo + (hi - lo) / 2;  
            if(mid * mid == x)  
                return true;  
            else if(mid * mid < x)  
                lo = mid + 1;  
            else  
                hi = mid - 1;  
        }  
        return false; 
    }
}