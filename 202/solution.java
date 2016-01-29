//nice work!
public class Solution {
    HashSet<Integer> hs = new HashSet<Integer>();
    public boolean isHappy(int n) {
        int temp = 0;
        while (n != 0)
        {
            temp += (n % 10) * (n % 10);
            n /= 10;
        }
        if (temp == 1)
            return true;
        else if (hs.contains(temp))
            return false;
        else
        {
            hs.add(temp);
            return isHappy(temp);
        }
    }
}