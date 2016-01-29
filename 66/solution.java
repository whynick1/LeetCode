//if possible, always use return instead of break;
//this will simplfy the following judgement
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null)
            return null;
        for (int i = digits.length - 1; i >= 0; i--)
        {
            if (digits[i] == 9)
            {
                digits[i] = 0;
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;}
    }
}