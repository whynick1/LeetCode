//difficulty is considering careful of all the possible conditions
//thougu solve the problem, I spent an hour to debug, which is terrible
//the following version is the same efficiency, but easier to understand
//by using a low and high pointer to record each head and rear of String, nice
public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        int len = nums.length, low = 0, high = 0;
        while (high < len) {
            if (high + 1 < len && nums[high] + 1 == nums[high + 1])
                high++;
            else {
                if (low == high) {
                    result.add(String.valueOf(nums[low]));
                } else {
                    result.add(nums[low] + "->" + nums[high]);
                }
                high++;
                low = high;
            }
        }
        return result;
    }
}

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> lst = new ArrayList<>();
        if (nums.length == 0 || nums == null)
            return lst;
        if (nums.length == 1)
        {
            lst.add("" + nums[0]);
            return lst;
        }
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i - 1] != nums[i] - 1)
            {
                if (count > 1)
                    sb.append("->" + nums[i - 1]);
                lst.add(sb.toString());
                sb.delete(0,sb.length());
                sb.append(nums[i]);
                count = 0;
            }
            if (i == nums.length - 1)
            {
                if (nums[i - 1] == nums[i] - 1)
                    sb.append("->" + nums[i]);
                lst.add(sb.toString());
            }
            count++;
        }
        return lst;
    }
}