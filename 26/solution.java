//good job!
public class Solution {
    public int removeDuplicates(int[] nums) {
        int countMove =  0;
        int countLength = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i-1])
                countMove++;
            else
            {
                countLength++;
                nums[i - countMove] = nums[i]; 
            }
        }
        return countLength;
    }
}