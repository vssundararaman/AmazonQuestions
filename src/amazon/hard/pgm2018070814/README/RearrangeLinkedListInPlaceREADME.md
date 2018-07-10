**Rearrange a given linked list in-place.**

Given a singly linked list L0 -> L1 -> … -> Ln-1 -> Ln. Rearrange the nodes in the list so that the new formed list is : L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 …

You are required do this in-place without altering the nodes’ values.

    Examples:  
    Input:  1 -> 2 -> 3 -> 4  
    Output: 1 -> 4 -> 2 -> 3  
    
    Input:  1 -> 2 -> 3 -> 4 -> 5  
    Output: 1 -> 5 -> 2 -> 4 -> 3 

Simple Solution

    1) Initialize current node as head.
    2) While next of current node is not null, do following
        a) Find the last node, remove it from end and insert it as next
           of current node.  
        b) Move current to next to next of current

Time complexity of the above simple solution is O(n2) where n is number of nodes in linked list. 

**Better Solution**
1) Copy contents of given linked list to a vector.
2) Rearrange given vector by swapping nodes from both ends.
3) Copy the modified vector back to linked list.

**Efficient Solution:**

    1) Find the middle point using tortoise and hare method.
    2) Split the linked list in two halves using found middle point in step 1.
    3) Reverse the second half.
    4) Do alternate merge of first and second halves. 

Time Complexity of this solution is O(n).

Output:

    1 -> 2 -> 3 -> 4 -> 5
    1 -> 5 -> 2 -> 4 -> 3

Time Complexity : O(n)
Auxiliary Space : O(1)
