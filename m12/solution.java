//good job, normal speed but too redundant code is
//actually, don't really have to consider buy and sell
//just calculate the profit when price go up next day
public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++)
            result += Math.max(prices[i] - prices[i - 1], 0);
        return result;
    }
}

// public class Solution {
//     public int maxProfit(int[] prices) {
//         //if keep goods, tomorrow up, remain; down, sell it
//         //if not keep, tomorrow up, buy it today; down, remain
//         boolean keep = false;
//         int profit = 0;
//         int buyPrice = 0;
//         if (prices.length == 0)
//             return 0;
//         for (int i = 0; i < prices.length - 1; i++)
//         {
//             if (!keep && prices[i + 1] >= prices[i])
//             {
//                 buyPrice = prices[i];
//                 keep = true;
//             }
//             if (keep && prices[i + 1] < prices[i])
//             {
//                 profit += prices[i] - buyPrice;
//                 keep = false;
//             } 
//         }
//         if (keep)
//             profit += prices[prices.length - 1] - buyPrice;
//         return profit;
//     }
// }
