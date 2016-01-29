//Standard solution without using another array
//Achieved by insert from the tail of nums1[]
//Slow but save space.
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return;
        }
    
        int a = m - 1;
        int b = n - 1;
    
        for(int i = m + n - 1; i >= 0; i--){
            if(a == -1){
                for(int j = 0; j <= b; j++){
                    nums1[j] = nums2[j];
                }
                return;
            }
            if(b == -1){
                return;
            }
            if(nums2[b] <= nums1[a]){
               nums1[i] = nums1[a];
               a--;
            }else{
                nums1[i] = nums2[b];
                b--;
            }
        }
        return;
    }
}

// //good job!
// public class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] temp = new int[(m + n)];
//         int p1 = 0;
//         int p2 = 0;
//         int pTemp = 0;
//         while (p1 < m && p2 < n)
//         {
//             if (nums1[p1] > nums2[p2])
//             {
//                 temp[pTemp++] = nums2[p2++];  
//             }
//             else
//             {
//                 temp[pTemp++] = nums1[p1++];
//             }
//         }
//         while (p1 < m)
//         {
//             temp[pTemp++] = nums1[p1++];
//         }
//         while (p2 < n)
//         {
//             temp[pTemp++] = nums2[p2++];
//         }
//         for (int i = 0; i < temp.length; i++)
//         {
//             nums1[i] = temp[i];
//         }
//     }
// }