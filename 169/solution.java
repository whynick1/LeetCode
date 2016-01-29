import java.util.HashMap;

//hashmap is one solution, but here it is very slow as 39ms.
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int temp = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (hm.containsKey(nums[i]))
            {
                temp = hm.get(nums[i]);
                hm.put(nums[i], ++temp);
            }
            else
                hm.put(nums[i], 1);
            if (hm.get(nums[i]) > nums.length / 2)
                    return nums[i];
        }
        return 0;
    }
}

/*
// Sorting
// 3ms running time
// strictly incorrect: element must be more than ⌊ n/2 ⌋, 
// but {1,1,2,3} sort alg will return 1 as majority num
public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length/2];
}*/

/*
// Moore voting algorithm (just for majority problem)
// amazing 2ms runing time, remember it!
public int majorityElement(int[] nums) {
    int count=0, ret = 0;
    for (int num: nums) {
        if (count==0)
            ret = num;
        if (num!=ret)
            count--;
        else
            count++;
    }
    return ret;
}*/
