public class Solution
{
    // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
        int count = 0;
        String str = Integer.toBinaryString(n);
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '1')
                count++;
        }
        return count;
    }
}

//use n&1 to judge if the lowest bit is '1', then n>>>1;
//in java, >> is signed shift(leftest bit will always remain the same); >>> is unsigned shift(ordinary)
//process bit is much faster then transfer decimal to binary number
/*public class Solution { // you need to treat n as an unsigned value 
    public int hammingWeight(int n) 
    { 
        int count = 0; 
        for(int i = 0; i < 32; i++) 
        { 
            if((n & 1) == 1) count++; n = n >>> 1; 
        } 
        return count; 
    }
}*/

//amazing algorithm!
//n &=(n-1) removes the smallest 1 bit in n!
/*public class Solution {
    public int hammingWeight(int n) {
        int i;
        for(i=0;n!=0;i++, n&=(n-1));
        return i;
    }
}*/