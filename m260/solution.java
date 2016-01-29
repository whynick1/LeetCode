//very hard question, failed, genious solution!
//as Problem Single Number I, it is abviously using bit operation, but how?

//In the first pass, we XOR all elements in the array, and get the XOR of the two numbers we need to find. 
//Note that since the two numbers are distinct, there must be a set bit (bit with value '1') in the XOR result.
//Find out an arbitrary set bit (for example, the rightmost set bit).

//In the second pass, we divide all numbers into two groups, one with the bit set, another with the bit unset. 
//Two different numbers we need to find must fall into two distrinct groups. 
//Other numbers will counteract with each other, finally, we can find a number in either group.

public class Solution {
    public int[] singleNumber(int[] nums) {
        // Pass 1 : 
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit (actually any "1 bit" is Ok)
        diff &= -diff;//负数的补码是:符号位为1,其余各位求反,末位加1

        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0) // the bit is not set
            {
                rets[0] ^= num;
            }
            else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }
}