class Solution {
    public int maxProfit(int[] prices) {
         int minPriceSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPriceSoFar) {
                minPriceSoFar = prices[i];
            } else {
                int profit = prices[i] - minPriceSoFar;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}