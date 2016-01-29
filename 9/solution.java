//meaningless problem
//imposible to achieve without extra space
//only thing learn from this is: how to reverse a Integer
public class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0,target = x;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            sum = sum * 10 + temp;
        }
        return sum == target;
    }
}