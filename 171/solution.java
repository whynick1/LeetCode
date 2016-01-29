//keep in mind that x=2^n is not display as 2^n in java
//you should use a for loop to wrap x *= 2, which iterate n times.
 
public class Solution {
    public int titleToNumber(String s) {
        int returnNum = 0;
        int n = 1;
        for (int i = 0; i < s.length(); i++)
        {
            returnNum += (n * (s.charAt(s.length() - i - 1)- 'A' + 1));
            n *= 26;
        }
        return returnNum;
    }
}