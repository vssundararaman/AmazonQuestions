**Partition a set into two subsets such that the difference of subset sums is minimum**

Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.

If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.

Example:

    Input:  arr[] = {1, 6, 11, 5} 
    Output: 1
    Explanation:
    Subset1 = {1, 5, 6}, sum of Subset1 = 12 
    Subset2 = {11}, sum of Subset2 = 11  

This problem is mainly an extension to the Dynamic Programming| Set 18 (Partition Problem).

**Recursive Solution**
The recursive approach is to generate all possible sums from all the values of array and to check which solution is the most optimal one.
To generate sums we either include the i’th item in set 1 or don’t include, i.e., include in set 2.

Output:

    The minimum difference between two sets is 1
    
**Time Complexity:**

    All the sums can be generated by either 
    (1) including that element in set 1.
    (2) without including that element in set 1.
    So possible combinations are :-  
    arr[0]      (1 or 2)  -> 2 values
    arr[1]    (1 or 2)  -> 2 values
    .
    .
    .
    arr[n]     (2 or 2)  -> 2 values
    So time complexity will be 2*2*..... *2 (For n times),
    that is O(2^n).

**Dynamic Programming**

The problem can be solved using dynamic programming when the sum of the elements is not too big. We can create a 2D array dp[n+1][sum+1] where n is number of elements in given set and sum is sum of all elements. We can construct the solution in bottom up manner.

    The task is to divide the set into two parts. 
    We will consider the following factors for dividing it. 
    Let 
      dp[n+1][sum+1] = {1 if some subset from 1st to i'th has a sum 
                          equal to j
                       0 otherwise}
        
        i ranges from {1..n}
        j ranges from {0..(sum of all elements)}  
    
    So      
        dp[n+1][sum+1]  will be 1 if 
        1) The sum j is achieved including i'th item
        2) The sum j is achieved excluding i'th item.
    
    Let sum of all the elements be S.  
    
    To find Minimum sum difference, w have to find j such 
    that Min{sum - j*2  : dp[n][j]  == 1 } 
        where j varies from 0 to sum/2
    
    The idea is, sum of S1 is j and it should be closest
    to sum/2, i.e., 2*j should be closest to sum.

Output:

    The minimum difference between 2 sets is 1

Time Complexity = O(n*sum) where n is number of elements and sum is sum of all elements.

Note that the above solution is in Pseudo Polynomial Time (time complexity is dependent on numeric value of input).