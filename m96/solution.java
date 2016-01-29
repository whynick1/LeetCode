//fail to solve the problem until check the main thought
//know must be DP solution, but did not come up with the formula: C(n) = ∑i=1->n C(i−1)C(n−i)

public class Solution {
    int count = 0;
    public int numTrees(int n) {
        if (n == 0)
            return n;
        int[] memory = new int[n + 1];
        count = numTreesRecur(n, memory);
        return count;
    }
    public int numTreesRecur(int n, int[] memory) {
        int count = 0;
        if (n <= 1)
            return 1;
        if (memory[n] != 0)
            return memory[n];
        for (int i = 1; i <= n; i++)
            count += numTreesRecur(i - 1, memory) *  numTreesRecur(n - i, memory);
        memory[n] = count;
        return count;
    }
}


