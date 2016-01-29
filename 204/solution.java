//tricky one!
//how to test a prime? By testing a number to see if it has "smaller" factors < Math.sqrt(number)
//I think my solution is efficient by using DP to avoid wasting time on non-prime number(o/w repeated)
//however, there is faster way when finding many prime within a rang
//once find a prime, set non-prime-table[i*prime] to true, then amazing things happened
//you don't need to check it by finding possible factors anymore, any non-prime-table[] = false, is a prime

//Another thing: int i could no be used before initiated
//but for int[] arr, arr[0] could be used because auto initated as 0
public class Solution {
    public int countPrimes(int n) {
         boolean[] m = new boolean[n];
        int count = 0;
        for (int i=2; i<n; i++) {
            if (m[i])
                continue;

            count++;
            for (int j=i; j<n; j=j+i)
                m[j] = true;
        }

        return count;
    }
}

// public class Solution {
//     public int countPrimes(int n) {
//         boolean[] primeTable = new boolean[n];
//         int primeCount = 0;
//         if (n <= 2)
//             return 0;
//         for (int i = 2; i < n; i++)
//         {
//             int sqr = (int)Math.sqrt(i);
//             boolean flag = true;
//             for (int j = 1; j <= i; j++)
//             {
//                 if (primeTable[j] == false)
//                     continue;
//                 //non prime
//                 else if (i % j == 0)
//                 {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag)
//             {
//                 primeTable[i] = true;
//                 primeCount++;
//             }
//         }
//         return primeCount;
//     }
// }

