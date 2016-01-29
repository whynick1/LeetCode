//great job!
//beat 73% with first submission
public class Solution {
    public int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        while (haystack.length() >= needleLen)
        {
            if (needle.equals(haystack.substring(0, needleLen)))
                return haystackLen - haystack.length();
            else
                haystack = haystack.substring(1);
        }
        return -1;
    }
}