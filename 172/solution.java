//fail to solve the problem
//I think the "Least common multiple of 5 that < n" is the number of zero
//however, I negelet the fact that 25 has double "5"
//it means "least common mutiple of 25 < n" will have an extra zero
//therefore, "while (n>1) s += (n/=5)"
public class Solution {
    public int trailingZeroes(int n) {
        int s = 0;
        while (n>1) s += (n/=5);
        return s;
    }
}