package task_121;

import java.util.Arrays;

public class Solution {

    public int maxProfit(int[] prices) {
        int actualCost = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            actualCost = Math.min(actualCost, prices[i]);
            profit = Math.max(profit, prices[i] - actualCost);
        }
        return profit;
    }

}
