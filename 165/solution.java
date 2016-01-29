//it is a pity to fail to solve the problem
//I have the idea of use a str.split"." to compare two numbers on both sides
//But I did not realize Integer.parseInt(xxx) could ignore the head and tail "0"s, that make it much simpler
//However, use: for( i =0;i<v1.length&&i<v2.length;i++) to first compare integer part is smart
//Another thing to pay attention is the use of regex in java
//symbols like: { "\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|" } 
//we add "\\" to serves the escaped constructs, etc "\\."

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[]v1=version1.split("\\."),v2=version2.split("\\.");
        int i;
        for( i =0;i<v1.length&&i<v2.length;i++)
            if(Integer.parseInt(v1[i])!=Integer.parseInt(v2[i]))
                return Integer.parseInt(v1[i])>Integer.parseInt(v2[i])?1:-1;
        for(;i<v1.length;i++)
            if(Integer.parseInt(v1[i])!=0)
                return 1;
        for(;i<v2.length;i++)
            if(Integer.parseInt(v2[i])!=0)
                return -1;
        return 0;
    }
}

