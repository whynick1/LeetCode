//good job!
//acceptable efficiency, but take too long to debug
//there is a faster solution, but hard to understand, try it next time!
public class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        int count = 1;
        char lastDigit = '1';//last digit number
        String temp = "1";
        //n - 1 times cycle
        for (int i = 1; i < n; i++)
        {
            StringBuilder sb = new StringBuilder();
            if (i == 1)
                sb.append("11");
            for (int j = 1; j < temp.length(); j++)
            {     
                if (lastDigit == temp.charAt(j))
                {
                    count++;
                }
                else
                {
                    sb.append(count);
                    sb.append(lastDigit);
                    count = 1;
                    lastDigit = temp.charAt(j);
                }
                if (temp.length() == (j + 1))
                {
                    sb.append(count);
                    sb.append(lastDigit);
                    count = 1;
                }
            }
            count = 1;
            temp = sb.toString();
            lastDigit = temp.charAt(0);
            // System.out.println("count = " + count  + "  lastDigit = " + lastDigit);
            // System.out.println("return: " + temp + "\n");
        }
        return temp;
    }
}

