//good job!
//only one thing: mark1 should be put before mark2
//means if pre-sum > 0, tempSum += nums[i]; o/w pre-sum < 0, tempsum = nums[i]
//this could avoid return 0, in case of [-1,-2,-3]
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        if (nums == null || nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length; i++)
        {
            //mark1
            if (tempSum <= 0)
                tempSum = 0;
            //mark2
            tempSum += nums[i];
            if (tempSum > maxSum)
                maxSum = tempSum;
        }
        return maxSum;
    }
}
