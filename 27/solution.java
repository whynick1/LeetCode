//this alg is simply, but I made a serious mistake here!
//When you pass an array to other method, actually the reference to that array is copied..
//Any changes in the content of array through that reference will affect the original array..
//But changing the reference to point to a new array will not change the existing reference in original method..
//so when I use nums = newNums, it change the reference, but not change the existing reference in main method.

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
//        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
//                newNums[count++] = nums[i];  
                nums[count++] = nums[i];  
            }
        }
//        nums = newNums;
        return count;
    }
}


