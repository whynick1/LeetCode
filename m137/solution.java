//fail to solve the problem
//very tricky, cause most of number occurs odd times rather even time, therefore, use bit operation by not directly XOR
//int = 23 bit, so use a digits[] to count the totol number on a certain bit
//by digits[i] % 3, get special number's bits, using res <<= 1; that is very convenient!
public class Solution {
    public int singleNumber(int[] nums) {
        int[] digits = new int[32];
        for(int i=0; i<nums.length; i++){
            int mask = 1;
            for(int j=31; j>=0; j--){
                if((mask & nums[i])!=0)
                    digits[j] ++;
                mask <<= 1;
            }
        }
        int res = 0;
        for(int i=0; i<32; i++){
            if(digits[i]%3==1)
                res += 1;
            if(i==31)
                continue;
            res <<= 1;
        }
        return res;
    }
}