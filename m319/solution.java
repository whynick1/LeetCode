//fail to meet the time limit, a tricky math solution is the key!
//so all number have even number of factors except square number
//so we only need to compute the number of square number less equal than n
//return (int)Math.sqrt(n); is fine, but using log() operation is faster then sqrt()
public class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.pow(2, 0.5 * (Math.log(n)/Math.log(2)));
    }
}

// public class Solution {
//     public int bulbSwitch(int n) {
//         if (n <= 0)
//             return 0;
//         //n round of toggle
//         boolean[] bulb = new boolean[n];
//         int count = 0;
//         Arrays.fill(bulb, false);
//         for (int i = 1; i < n + 1; i++)
//         {
//             for (int j = i - 1; j < n; )
//             {
//                 if (bulb[j])
//                     count--;
//                 else
//                     count++;
//                 bulb[j] = !bulb[j];
//                 j += i;
//             }
//         }
//         return count;
//     }
// }