//good job!
//using a complete sum minus a real sum is the missing number
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = ((nums.length + 1) * nums.length) >> 1;
        int realSum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            realSum += nums[i];
        }
//        System.out.println(sum + " " + realSum);
        return sum - realSum;
    }
}