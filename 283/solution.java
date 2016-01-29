public class Solution {
    private int count0 = 0;
    public void moveZeroes(int[] nums) {
        for ( int i = 0; i < nums.length - 1; i++)
        {
            if ( nums[i - count0] == 0 )
            {
                rearrange(i - count0, nums);
                count0++;
            }
        }
    }
    
    public void rearrange( int i , int[] array)
    {
        int temp = array[i];
        for ( int j = i; j < array.length - 1; j++ )
        {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = temp;
    }   
}

// O(n) runtime version:
// swtich the first non-zero with the first zero, also keep the original order!
// magic!

// public class Solution {    
//     public void moveZeroes(int[] nums) {
//         int z = -1;
//         for (int i=0; i< nums.length; i++) {
//             int temp = nums[i];
//             if (temp != 0) {
//                 nums[i]=nums[++z];
//                 nums[z]=temp;
//             }
//         }
//     }
//}