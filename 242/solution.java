public class Solution {
    public boolean isAnagram(String s, String t) {
        int alphabet[] = new int[26];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++)
        {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++)
        {
            if (alphabet[i] != 0)
                return false;
        }
        return true;
    }
}

// use char[] a = String.toCharArray(), then Array.sort(a), finally String.valueOf(a).equals(...)
// using quick sort, so sorting does not means slower
// String.toCharArray() will transfer string to char[]; while String.valueOf() will do the opposite!
/*    char [] a =s.toCharArray();
    char [] b =t.toCharArray();
    Arrays.sort(a);Arrays.sort(b);

    if(String.valueOf(a).equals(String.valueOf(b)))
        return true;
    else
        return false;*/
