//fail to solve it, because of using DP
//in this case, DP is not necessary
//because one of the left two array must be the max value
//etc.{1,2,3,4,5}, {1,3,5} or {2,4} will be the maximum.
public class Solution {
    public int rob(int[] nums) {
        int cur =0, left1 = 0 , left2 =0;
    
        for(int v: nums){
            cur = Math.max(left1, left2 + v);
            left2 = left1;
            left1 = cur; 
        }
        return cur; 
    }
}
//Of course, DP is a solution, while the bottleneck for me is, how to
//let program know dp[n] has been calculated before.
//This example give us two methods.
//1.use rob(int[]) wrap rob_dp(int[], int length), the dp[] could be initiated within rob() method.
//2.also the same, but use a HashMap<,> to Map.push(key), and using Map.containKey() to check 
//if dp[n] has been calculated before.

// public class Solution {
//     Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

//     /**
//      * return max amount of money that can be robbed from all house houses without triggering alarm
//      * @param nums array of amount of money in each house
//      * 
//      * @return max amount of money that can be robbed from all houses without triggering alarm 
//      **/
//     public int rob(int[] nums) {
//         if (nums == null) return 0;
//         return rob_aux(nums, nums.length);
//     }

//     /**
//      * return max amount of money robbed from first n houses
//      * @param nums amount of money in each house
//      * @param n number of house
//      * 
//      * @return max amount of money can be robbed from house [0-n) without triggering alarm 
//      **/
//     private int rob_aux(int[] nums, int n){
//         if (memo.containsKey(n)) return memo.get(n);
//         int k;

//         if (n <= 0){
//             //no house
//             return 0;
//         } else if (n == 1) {
//             //house 0 only
//             k = nums[0];
//         } else {
//             //M[n] = max amount of money can be robbed from house [0-n) without triggering alarm
//             //L[n] = amount of money in house n
//             //M[n] = MAX(M[n-1] + L[n], M[n-2] +  L[n-1])
//             k = max(rob_aux(nums, n-2) + nums[n-1], rob_aux(nums, n-3) + nums[n-2]);
//         }
//         memo.put(n,k);
//         return k;
//     }

//     private int max(int a, int b){
//         if(a > b) return a;
//         return b;
//     }
// }