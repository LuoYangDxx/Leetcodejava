public class Solution {
    public int[] countBits(int num) {
        int pow = 1;
        int p = 1;
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            if (i == pow) {
                pow <<= 1;
                p = 1;
                result[i] = 1;
            } else {
                result[i] = result[p] + 1;
                p++;
            }
        }
        return result;
    }
}