//recursion method has exceed time limit
//So I have to implement dynamic programing
public class Solution {
    int cnt[] = new int[100];
    public int climbStairs(int n) {
        if (n <= 2)
        {
            cnt[n] = n; 
            return n;
        }
        if (cnt[n] != 0)
            return cnt[n];
        cnt[n] = climbStairs(n-1) + climbStairs(n-2);
        return cnt[n];
    }
}

//A more simpler way is to use iteration
/*public class Solution {
  public int climbStairs(int n) {
    if(n==1||n==0)
        return n;
    int count1=1;
    int count2=1;


    for(int i=2; i<=n; i++){
        int temp = count2;
        count2 = temp+count1;
        count1 = temp;
    }
    return count2;
    }
}*/