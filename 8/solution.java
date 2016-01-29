//my code works, but very redundant and not clear, because of following problem.
//1. string == null & string.length() == 0 is two different condition
//2. do not add character to string, and check all; instead use a pointer to let them could be checked
//from a same start line.
//3. how to check if the variale "sum" out of range of int?
//Define long sum, when it is larger than the bound, then means overflow
public class Solution {
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        str = str.trim();
        char firstChar = str.charAt(0);
        int sign = 1, start = 0, len = str.length();
        long sum = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < len; i++) {
            if (!Character.isDigit(str.charAt(i)))
                return (int) sum * sign;
            sum = sum * 10 + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
    
        return (int) sum * sign;
    }
}
