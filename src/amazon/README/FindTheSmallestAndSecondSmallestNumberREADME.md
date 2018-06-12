Find the smallest and second smallest elements in an array
Write an efficient C program to find smallest and second smallest element in an array.

Example:

Input:  arr[] = {12, 13, 1, 10, 34, 1}
Output: The smallest element is 1 and 
        second Smallest element is 10
        
A Simple Solution is to sort the array in increasing order. The first two elements in sorted array would be two smallest elements. Time complexity of this solution is O(n Log n).

A Better Solution is to scan the array twice. In first traversal find the minimum element. Let this element be x. In second traversal, find the smallest element greater than x. Time complexity of this solution is O(n).

The above solution requires two traversals of input array.

An Efficient Solution can find the minimum two elements in one traversal. Below is complete algorithm.

Algorithm:

1) Initialize both first and second smallest as INT_MAX
   first = second = INT_MAX
2) Loop through all the elements.
   a) If the current element is smaller than first, then update first 
       and second. 
   b) Else if the current element is smaller than second then update 
    second
    

Output:

The smallest element is 1 and second Smallest element is 10
The same approach can be used to find the largest and second largest elements in an array.