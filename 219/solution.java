//good job!
//don't miss the {1,0,1,1} 1 situation, update the second '1' in HashMap
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (hm.containsKey(nums[i]))
            {
                 if ((i - hm.get(nums[i])) <= k)  
                    return true;
            }
            hm.put(nums[i], i);
        }
        return false;
    }
}