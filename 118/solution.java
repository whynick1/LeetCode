//good job!
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++)
        {
            List<Integer> list = new ArrayList<Integer>();
            int j = 0;
            while (j <= i)
            {
                int temp;
                if (j == 0 || j == i)
                    temp = 1;
                else
                    temp = returnList.get(i - 1).get(j - 1) + returnList.get(i - 1).get(j);
                list.add(temp);
                j++;
            }
            returnList.add(list);
        }
        return returnList;
    }
}