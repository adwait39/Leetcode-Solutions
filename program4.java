/*
 * -------------------------------------------------------------
 * Program: Best Time to Buy and Sell Stock
 * 
 * Description:
 * You are given an array `prices` where `prices[i]` is the price 
 * of a given stock on the ith day. You want to maximize your profit 
 * by choosing a single day to buy one stock and choosing a different 
 * day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. 
 * If you cannot achieve any profit, return 0.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Example 1:
 * Input:  prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), 
 * profit = 6 - 1 = 5.
 * 
 * Example 2:
 * Input:  prices = [7, 6, 4, 3, 1]
 * Output: 0
 * Explanation: No transactions are done since no profit is possible.
 * 
 * Author: Adwait 
 * Date: 9-7-25
 * -------------------------------------------------------------
 */

public class program4
{
    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        maxProfit(arr);
    }
    public static int maxProfit(int[] prices) 
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++)
        {
            if(buyPrice<prices[i])
            {
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}