// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);

//looks simple, unfortunately, what it want is to use DP solution
//direct calculation is not slow, but if the sumRang() is called many times, things are different
//therefore, use a numSum to cumulatively store sum value is a good DP solution
public class NumArray {
    int[] nums;
    int[] numSum;
    public NumArray(int[] nums) {
        this.nums = nums;
        numSum = new int[nums.length + 1];
        numSum[0] = 0;
        for(int i = 1; i < numSum.length; i++){
            numSum[i] = numSum[i - 1] + nums[i - 1];
        }
    }
    
    public int sumRange(int i, int j) {
        if(i < 0 || j >= nums.length){
            return 0;
        }
    
        return numSum[j + 1] - numSum[i];
    }
}


// public class NumArray {
//     int[] nums;
//     public NumArray(int[] nums) {
//         for (int i = 0; i < nums.length; i++)
//         {
//             this.nums = nums;
//         }
//     }

//     public int sumRange(int i, int j) {
//         int count = 0;
//         for (int k = i; k <= j; k++)
//         {
//             count += nums[k];
//         }
//         return count;
//     }
// }
