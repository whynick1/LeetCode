//From Wiki, in Pascal's Triangle, the value of ith integer in kth row is ( k! / ( i! * (k-i)! )).
//Key: Tranlate math formula into code.
//Using only O(k) space eliminates DP recurrion solution.
public class Solution {
    public List<Integer> getRow(int rowIndex)
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        if(rowIndex==0)
        {
            return list;
        }
        if(rowIndex%2==0)
        {
            long num=1;
            for(int i=1;i<=rowIndex/2;i++)
            {
                num=num*(rowIndex-i+1)/i;
                list.add((int)num);
            }
            for(int i=list.size()-2;i>=0;i--)
            {
                list.add(list.get(i));
            }
        }
        else
        {
            long num=1;
            for(int i=1;i<=rowIndex/2;i++)
            {
                num=num*(rowIndex-i+1)/i;
                list.add((int)num);
            }
            for(int i=list.size()-1;i>=0;i--)
            {
                list.add(list.get(i));
            }
        }
        return list;
    }
}

// I use recursion, but cannot finish in time.
// public class Solution {
//     public List<Integer> getRow(int rowIndex) {
//         List<Integer> lst = new LinkedList<Integer>();
//         int count = 1;
//         lst.add(1);
//         if (rowIndex == 0)
//          return lst;
//         while(count < rowIndex)
//         {
//          //get the last row, add count & count+1
//          lst.add(getNumber(rowIndex, count++));
//         }
//         lst.add(1);
//         return lst;
//     }
    
//     public int getNumber(int rowNum, int cnt)
//     {
//      if (cnt == 0 || cnt == rowNum)
//          return 1;
//      else
//          return (getNumber(rowNum - 1, cnt - 1) + getNumber(rowNum - 1, cnt));
//     }
// }