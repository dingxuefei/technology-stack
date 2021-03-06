package cn.mccreefei.technologystack.leetcode;

/**
 * @author MccreeFei
 * @create 2020-02-17 下午3:27
 * @refer <href>https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/</href>
 * @idea 
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                result += prices[i] - prices[i-1];
            }
        }
        return result;
    }
}
