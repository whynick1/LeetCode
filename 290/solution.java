// good job!
// but could be more efficient by using <Character, String> instead of <Character, Integer>
// it is like: if( table.containsKey(c) && !table.get(c).equals(arr[i]))
// So, alwasys remember directly use key to compare value.
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, Integer> hm =  new HashMap<>();
        Set<String> hs = new HashSet<>();
        char[] pats = pattern.toCharArray();
        String[] animals = str.split(" ");
        if (pats.length != animals.length)
            return false;
        for (int i = 0; i < pats.length; i++)
        {
            if (hm.containsKey(pats[i]))
            {
                if (!animals[i].equals(animals[hm.get(pats[i])]))
                    return false;
            }
            else
            {
                if (hs.contains(animals[i]))
                    return false;
                hm.put(pats[i], i);
            }
            hs.add(animals[i]);
        }
        return true;
    }
}