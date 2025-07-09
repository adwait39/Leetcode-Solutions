/*
 * -------------------------------------------------------------
 * Program: Trapping Rain Water
 * 
 * Description:
 * Given `n` non-negative integers representing an elevation map 
 * where the width of each bar is 1, this program computes how 
 * much water can be trapped after raining.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Example 1:
 * Input:  height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 * Output: 6
 * Explanation: The elevation map traps 6 units of rain water.
 * 
 * Example 2:
 * Input:  height = [4, 2, 0, 3, 2, 5]
 * Output: 9
 * 
 * Author: Adwait
 * Date: 9-7-25
 * -------------------------------------------------------------
 */

public class program3
{
    public static void main(String args[])
    {
        int arr[] = {4, 2, 0, 3, 2, 5};
        int result = trappedWater(arr);
        System.out.println("Total trapped water: " + result);
    }

    public static int trappedWater(int height[])
    {
        int n = height.length;
        if (n == 0) return 0;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // Calculate leftMax
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++)   // FIX: i = 1
        {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate rightMax
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int trappedW = 0;  // FIX: declare first
        for(int i = 0; i < n; i++)
        {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedW += waterLevel - height[i];
        }

        return trappedW;
    }
}
