//fail to solve the problem
//I try to use a HashSet[] to store an compare each of charaters of strings, however too expensive
//It is very smart to convert string to binary bit array, then compare the binary bit array
//which is much easier to check if has same character by if((mask[i] & mask[j]) == 0)
public class Solution {
    public int maxProduct(String[] words) {
        int[] mask = new int[words.length];
        for(int i = 0; i < words.length; i++) {
//            System.out.println("now is string:" + i);
            for(int j = 0; j < words[i].length(); j++) {
                mask[i] |= 1 << (words[i].charAt(j) - 'a');
//                System.out.println(Integer.toBinaryString(mask[i]));
            }
        }
        int max = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if((mask[i] & mask[j]) == 0) {
//                    System.out.println("now mask[" + i + "] & [" + j + "] = 0");
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }
}