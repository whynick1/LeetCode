//good job!
//but can do better by use only O(1) space! 
//The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, 
//first we reverse [1,2,3,4], then we reverse[5,6,7], it becomes[7,6,5], 
//finally we reverse the array as a whole
//genious solution! but what we can learn from it is that good solution is not all about coding, idea is also important
public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length < 2){
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    private void reverse(int[] nums, int i, int j){
        int tmp = 0;       
        while(i < j){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}

// public class Solution {
//     public void rotate(int[] nums, int k) {
//         int[] sortnums = new int[nums.length];
//         for (int i = 0, j = k; i < nums.length; i++, j++)
//         {
//             sortnums[j % nums.length] = nums[i];
//         }
//         for (int i = 0; i < nums.length; i++)
//         {
//             nums[i] = sortnums[i];
//         }
//     }   
// }

