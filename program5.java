/*
 * -------------------------------------------------------------
 * Program: Contains Duplicate: NOT OPTIMAL SOLN(BRUTE FORCE)
 * 
 * Description:
 * Given an integer array `nums`, return true if any value appears 
 * at least twice in the array, and return false if every element 
 * is distinct.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Example 1:
 * Input:  nums = [1, 2, 3, 1]
 * Output: true
 * Explanation: The element 1 occurs at indices 0 and 3.
 * 
 * Example 2:
 * Input:  nums = [1, 2, 3, 4]
 * Output: false
 * Explanation: All elements are distinct.
 * 
 * Example 3:
 * Input:  nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 * Output: true
 * 
 * Author: Adwait Desai
 * Date: 9-7-25
 * -------------------------------------------------------------
 */

public class program5
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4};

        boolean bRet  = containsDuplicate(arr);
        if(bRet==true)
        {
            System.out.println("DUPLICATE PRESENT");
        }
        else
        {
            System.out.println("NO DUPLICATE FOUND");
        }
    }

    public static boolean containsDuplicate(int[] nums)
    {
        int i=0, j=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && i!=j)
                {
                    return true;
                }
            }
        }

        return false;
    }
}