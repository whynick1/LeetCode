//fail to solve the problem
//it is not impossible to solve, just give up too quick, not try on paper
//O(n) usually means use more than one for loop or use bit operation
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] output = new int[len];
    
        int leftMult = 1, rightMult = 1;
    
        for(int i = len-1; i >= 0; i--){
            output[i] = rightMult;
            rightMult *= nums[i];
        }
        for(int j = 0; j < len; j++){
            output[j] *= leftMult;
            leftMult *= nums[j];
        }
        return output; 
    }
}