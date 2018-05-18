# AmazonQuestions

Given an array A[] and a number x, check for pair in A[] with sum as x

METHOD 1 (Use Sorting)

Algorithm:

hasArrayTwoCandidates (A[], ar_size, sum)
1) Sort the array in non-decreasing order.
2) Initialize two index variables to find the candidate 
   elements in the sorted array.
       (a) Initialize first to the leftmost index: l = 0
       (b) Initialize second  the rightmost index:  r = ar_size-1
3) Loop while l < r.
       (a) If (A[l] + A[r] == sum)  then return 1
       (b) Else if( A[l] + A[r] <  sum )  then l++
       (c) Else r--    
4) No candidates in whole array - return 0
Time Complexity: Depends on what sorting algorithm we use. If we use Merge Sort or Heap Sort then (-)(nlogn) in worst case. If we use Quick Sort then O(n^2) in worst case.
Auxiliary Space : Again, depends on sorting algorithm. For example auxiliary space is O(n) for merge sort and O(1) for Heap Sort.

Example:
Let Array be {1, 4, 45, 6, 10, -8} and sum to find be 16

Sort the array
A = {-8, 1, 4, 6, 10, 45}

Initialize l = 0, r = 5
A[l] + A[r] ( -8 + 45) > 16 => decrement r. Now r = 10
A[l] + A[r] ( -8 + 10) < 2 => increment l. Now l = 1
A[l] + A[r] ( 1 + 10) < 16 => increment l. Now l = 2
A[l] + A[r] ( 4 + 10) < 14 => increment l. Now l = 3
A[l] + A[r] ( 6 + 10) == 16 => Found candidates (return 1)

Note: If there are more than one pair having the given sum then this algorithm reports only one. Can be easily extended for this though.

Below is the implementation of the above approach.

// Java program to check if given array 
// has 2 elements whose sum is equal 
// to the given value
import java.util.*;
 
class GFG
{
    // Function to check if array has 2 elements 
    // whose sum is equal to the given value
    static boolean hasArrayTwoCandidates(int A[], 
                           int arr_size, int sum)
    {
        int l, r;
     
        /* Sort the elements */
        Arrays.sort(A);
     
        /* Now look for the two candidates 
        in the sorted array*/
        l = 0;
        r = arr_size-1; 
        while (l < r)
        {
            if(A[l] + A[r] == sum)
                return true; 
            else if(A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        } 
        return false;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, 10, -8};
        int n = 16;
        int arr_size = A.length;
         
        // Function calling
        if(hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Array has two " + 
                               "elements with given sum");
        else
            System.out.println("Array doesn't have " +
                               "two elements with given sum");
     
    }
 
}
Output:
Array has two elements with the given sum


METHOD 2 (Use Hashing)
This method works in O(n) time.

1) Initialize an empty hash table s.
2) Do following for each element A[i] in A[]
   (a)    If s[x - A[i]] is set then print the pair (A[i], x - A[i])
   (b)    Insert A[i] into s.
Below is the implementation of the above approach :


// Java implementation using Hashing
import java.io.*;
import java.util.HashSet;
 
class PairSum
{
    static void printpairs(int arr[],int sum)
    {       
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && s.contains(temp))
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            s.add(arr[i]);
        }
    }
 
    // Main to test the above function
    public static void main (String[] args)
    {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A,  n);
    }
}

Time Complexity: O(n)
Output:
Pair with given sum 16 is (10, 6)
Auxiliary Space: O(n) where n is size of array.

If range of numbers include negative numbers then also it works. All we have to do for negative numbers is to make everything positive by adding the absolute value of smallest negative integer to all numbers.