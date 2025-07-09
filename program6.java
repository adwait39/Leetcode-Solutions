/*
 * -------------------------------------------------------------
 * Program: Contains Duplicate -OPTIMAL
 * 
 * Description:
 * Given an integer array `nums`, return true if any value appears 
 * at least twice in the array, and return false if every element 
 * is distinct.
 * 
 * Approach:
 * Use a HashSet to track elements seen so far.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Example:
 * Input: nums = [1, 2, 3, 1]
 * Output: true
 * 
 * Author: Adwait
 * Date: 9-7-25
 * -------------------------------------------------------------
 */

import java.util.HashSet;

public class program6
{

    public static boolean containsDuplicate(int[] nums)
     {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;  // Duplicate found!
            }
            seen.add(num);
        }
        
        return false; // All elements are unique
    }

    public static void main(String[] args) 
    {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Contains duplicate? " + containsDuplicate(nums));
    }
}
