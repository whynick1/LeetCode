//good job!
//first time: neglect non-overlap condition
//second time: neglect 4 different non-overlap conditions
//therefore, would better draw a picturn to help design alg
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int length;
        int width;
        if (B > H || F > D || A > G || E > C)
                return (C - A) * (D - B) + (H - F) * (G - E);
        width = Math.min(D, H) - Math.max(B, F);
        length = Math.min(C, G) - Math.max(A, E);
        return ((C - A) * (D - B) + (H - F) * (G - E) - width * length);
    }
}

