//good job!
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            char temp = s.charAt(i);
            switch(temp)
            {
                case '(': st.push(temp);
                          break;
                case '[': st.push(temp);
                          break;
                case '{': st.push(temp);
                          break;
                case ')': if (st.empty() == true)
                             return false;
                          if (st.pop() == '(')
                             break;
                           else
                             return false;
                case ']': if (st.empty() == true)
                             return false;
                          if (st.pop() == '[')
                             break;
                          else
                             return false;
                case '}': if (st.empty() == true)
                             return false;
                          if (st.pop() == '{')
                             break;
                          else
                             return false;
                default: return false;
            }
        }
        if (st.empty() == true)
            return true;
        else
            return false;
    }
}

