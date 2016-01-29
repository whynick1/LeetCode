//I try to use String.charAt() to find the last " ", but it is slow
//Using Scanner.hasnext() is much slower (Not familiar with the java.String operation)
//The right way is to use:
//(1) s.trim() to return string with leading and trailing whitespace omitted
//(2) s.lastIndexOf(' ') to find the last ' '

public class Solution {
        public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;        
    }
}

// public class Solution {
//     public int lengthOfLastWord(String s) {
//         Scanner sc = new Scanner(s);
//         String str = null;
//         if (!sc.hasNext())
//             return 0;
//         while (sc.hasNext())
//          str = sc.next();
//         sc.close();
//         return str.length();
//     }
// }

// public class Solution {
//     public int lengthOfLastWord(String s) {
//         int countLastWord = 0;
//         boolean flag = false;
//         if (s == null)
//             return 0;
//         for (int i = 0; i < s.length(); i++)
//         {
//             if (s.charAt(i) == ' ')
//                 flag = true;
//             else if (flag)
//             {
//                  countLastWord = 1;
//                  flag = false;
//             }
//             else
//                 countLastWord++;
//         }
//         return countLastWord;
//     }
// }