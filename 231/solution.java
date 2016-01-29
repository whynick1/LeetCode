//Perfect way to use bit manipulation to judge a powerOfTwo number!
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0; 
    }
}
// My solution exceed time limit
// public class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n == 1)
//             return true;
//         if (n % 2 == 1)
//             return false;
//         while (n % 2 == 0)
//         {
//             n /= 2;
//         }
//         if (n == 1)
//             return true;
//         else 
//             return false;
//     }
// }