//good job!
//be careful in recursion, count++ != count + 1; because count++ will change the count value
//while count + 1 only pass increment count
public class Solution {
    List<String> list = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        String str = new String();
        recurParenthesis(str, n, 0, 0);
        return list;
    }
    //count will count the sum of "(", which must be <= n
    //leftRemain == true means next char must be "("
    public void recurParenthesis(String str, int n, int count, int leftRemain)
    {
        if (str.length() == n<<1)
            list.add(str);
        
        else
        {
            if (count == 0 || leftRemain <= 0)
                recurParenthesis(str + "(", n, count + 1, leftRemain + 1);
            else if(count >= n)
                recurParenthesis(str + ")", n, count, leftRemain - 1);
            else
            {
                recurParenthesis(str + "(", n, count + 1, leftRemain + 1);
                recurParenthesis(str + ")", n, count, leftRemain - 1);
            }
            
        }
    }
}