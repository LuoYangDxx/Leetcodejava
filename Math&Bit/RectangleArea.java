public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (D - B) * (C- A);
        int areaB = (G - E) * (H - F);
        if (C < E || A > G || B > H || F > D) return areaA + areaB;
        else {
            int left = Math.max(A, E);
            int right = Math.min(C, G);
            int top = Math.min(D, H);
            int bottom = Math.max(B, F);
            return (areaA + areaB) - (right - left) * (top - bottom);
        }
    }
}