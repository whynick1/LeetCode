/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//good job!
//there are things need to pay attention:
//1. use mid = low + (high - low) / 2; instead of mid = (low + high) / 2;
//can avoid overflow when the number of "high" are very big
//2. non-recursive solution is ususally faster. And since a little different from binary sort
// , try some simple example to make sure the new range, etc. (mid + 1, high) is correct
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;            
        }        
        return start;
    }
}

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         return recurCheck(1, n);
//     }
    
//     public int recurCheck(int low, int high)
//     {
//         if (low >= high)
//             return low;
//         int mid = low + (high - low) / 2;
//         if (isBadVersion(mid))
//         {
//             return recurCheck(low, mid);
//         }
//         else
//             return recurCheck(mid + 1, high);
//     }
// }