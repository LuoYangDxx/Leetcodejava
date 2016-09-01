public class Solution {
    public String getHint(String secret, String guess) {
        int[] a = new int[10];
        int[] b = new int[10];
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) bull++;
            else {
                a[s - '0']++;
                b[g - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            cow += Math.min(a[i], b[i]);
        }
        return bull + "A" + cow + "B";
    }
}