//fail to solve the problem
//because cannot find a easy way to judge "egg" with "ooo"
//the answer is pretty instructive:
//1. use a map.put(sList[i], tList[i]) to form a hashmap to judge
//2. By new HashSet<>(map.values()).size()) to slove "egg" with "ooo"
//(because HashSet<> will be built with a Collection of map.value(), same value will be neglected in hash -> cause different size)
public class Solution {
     public boolean isIsomorphic(String s, String t) {
        Map<String, String> map = new HashMap<>();
        //two way to convert string into array:
        //1. char[] ch = str.tocharArray;
        //2. String[] strArray = str.split("XXX")
        String[] sList = s.split("");
        String[] tList = t.split("");
        if (s.length() != t.length()) return false;
        for (int i = 0; i < sList.length; i++) {
            if (!map.containsKey(sList[i])) {
                map.put(sList[i], tList[i]);
            } else {
                if (!map.get(sList[i]).equals(tList[i])) return false;
            }
        }
        System.out.println("!!!" + map.values().size() + "//" + new HashSet<>(map.values()).size());
        return map.values().size() == new HashSet<>(map.values()).size();
    }
}

//The second solution is even genious, which beat 98% of submission
//The main idea is to Use ASSIC to store the characters and use two int[] to store each other

// public class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length() != t.length()) return false;

//         int N = s.length();
//         int[] mst = new int[256];
//         int[] mts = new int[256];

//         for(int i = 0; i < N; i++) {
//             char cs = s.charAt(i);
//             char ct = t.charAt(i);

//             if((mst[cs] == 0) && (mts[ct] == 0)) {
//                 mst[cs] = ct;
//                 mts[ct] = cs;
//             }

//             if((mst[cs] != ct) || (mts[ct] != cs)) 
//                 return false;
//         }

//         return true;
//     }
// }