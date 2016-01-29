//good job!
//for save space, can also use: sb.append((char)(r - 1 + 'A'))
//there is one tricky detail in this problem
//that when input 26, quotient will be 1, then while loop will execute one more time, give out "AZ"
//to eliminate that problem, just careful observe the regular, when remain is 0, quotient--, problem solved
public class Solution {
    public String convertToTitle(int n) {
        char[] table = {'Z','A','B','C','D','E','F','G','H','I'
            ,'J','K','L','M','N','O','P','Q','R','S','T'
            ,'U','V','W','X','Y'};
        int current = n;
        String str = "";
        while (current > 0)
        {   
            int lowDigit = current % 26;
            str = table[lowDigit] + str;
            current /= 26;
            if (lowDigit == 0)
                current--;
        }
        return str;
    }
}