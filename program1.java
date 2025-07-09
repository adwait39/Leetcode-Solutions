/*
 * -------------------------------------------------------------
 * Program: Binary Search in Sorted Array
 * 
 * Description:
 * Given a sorted array of integers `nums` in ascending order 
 * and an integer `target`, this program implements binary search 
 * to find the target's index. If the target exists in the array, 
 * it returns its index; otherwise, it returns -1.
 * 
 * Time Complexity:
 * O(log n)
 * 
 * Example:
 * Input:  nums = [-1, 0, 3, 5, 9, 12], target = 9
 * Output: 4
 * 
 * Input:  nums = [-1, 0, 3, 5, 9, 12], target = 2
 * Output: -1
 * 
 * Author: Adwait Desai
 * Date: 07-07-2025
 * -------------------------------------------------------------
 */


public class program1
{
    public static void main(String args[])
    {
        int arr[] = {2,4,6,8,10,12};
        int key = 10;

        System.out.println("Key is:"+BinarySearch(arr, key));
    }

    public static int BinarySearch(int arr[], int key)
    {
        int start = 0;
        int end = arr.length-1;

        for(int i=0; i<arr.length; i++)
        {
            int mid = (start+end)/2;
            if(arr[mid]>key)
            {
                end = mid-1;
            }
            else if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                start = mid+1;
            }
        }

        return -1;
    }
}