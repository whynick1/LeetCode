//difficulty lies on how to judge if the char is an alphanumeric character
//Character.isLetterOrDigit(char) is one of the solution
//another solution is to remove invalid characters by using str.replaceAll(regex正则表达式, String)
//how to use regex in java: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
public class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}

