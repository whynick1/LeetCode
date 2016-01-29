//fail to solve the problem
//what is the best way to reverse a integer in decimal?
//the "result = 10*result + x % 10;" in while loop is the key!
public class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int result = 0;
        int max_diff = Integer.MAX_VALUE / 10;
        while(x > 0) {
            if(result > max_diff) return 0;
            result = 10*result + x % 10;
            x /= 10;
        }
        return isNegative ? -result : result;
    }
}