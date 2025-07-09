/*
 * -------------------------------------------------------------
 * Program: Maximum Subarray Sum (Kadane's Algorithm)
 * 
 * Description:
 * Given an integer array `nums`, this program finds the contiguous 
 * subarray (containing at least one number) which has the largest sum 
 * and returns its sum.
 * 
 * This implementation uses Kadane's Algorithm to achieve O(n) 
 * time complexity.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Example 1:
 * Input:  nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6
 * Explanation: The subarray [4, -1, 2, 1] has the largest sum 6.
 * 
 * Example 2:
 * Input:  nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 * 
 * Example 3:
 * Input:  nums = [5, 4, -1, 7, 8]
 * Output: 23
 * Explanation: The subarray [5, 4, -1, 7, 8] has the largest sum 23.
 * 
 * Author: Adwait
 * Date: 08-07-2025
 * -------------------------------------------------------------
 */

public class program2
{
    public static void main(String args[])
    {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArray(arr);
    }

    public static void maxSubArray(int arr[])
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            currentSum = currentSum+arr[i];
            if(currentSum<0)
            {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("Max subarray sum is:" + maxSum);
    }
}