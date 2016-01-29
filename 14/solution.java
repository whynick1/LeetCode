//take 4ms to solve by myself
//the main difficulty is to judge if each String is longer than first one, therefore avoid OutOfBoundException
//the ideal solution take only 1ms, which is genious! Learn from it!
//First, it simply use a for loop to find the shortest String and its index.
//Second, it assuming the shortest String is what we want, then start checking from its maximum length
//By take advantage of str.startsWith(String), you can easily check prefix the same or not.
//Once failed, shortestLength--, start check the substring until for loop fully executed, means you can return the substring now
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int shortestIndex=0;
        int shortestLen=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<shortestLen){
                shortestLen=strs[i].length();
                shortestIndex=i;
            }
        }
        while(shortestLen>0){
            int i=0;
            for(i=0;i<strs.length&&strs[i].startsWith(strs[shortestIndex].substring(0,shortestLen));i++);
            if(i==strs.length) return strs[shortestIndex].substring(0,shortestLen);
            shortestLen--;
        }
        return "";
    }
}

// public class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         int count = 0;
//         boolean flag = false;
//         int i = 0;
//         if (strs.length == 0 || strs[0].length() == 0)
//             return "";
//         if (strs.length == 1)
//             return strs[0];
//         while (!flag)
//         {
//             if (strs[0].length() < i + 1)
//                 break;
//             for (int j = 1; j < strs.length; j++)
//             {
//                 if (strs[j].length() < i + 1)
//                 {
//                     flag = true;
//                     break;
//                 }
//                 char firstCh = strs[0].charAt(i);
//                 if (strs[j].charAt(i) != firstCh)
//                 {
//                     flag = true;
//                     break;
//                 }
//             }
//             if (!flag)
//                 count++;
//             else
//                 break;
//             i++;
//         }
//         return strs[0].substring(0, count);
//     }
// }

