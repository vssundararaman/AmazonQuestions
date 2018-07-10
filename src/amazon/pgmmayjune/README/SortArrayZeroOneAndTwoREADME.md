**Sort an array of 0s, 1s and 2s**

Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. 
The functions should put all 0s first, then all 1s and all 2s in last.

Examples:

    Input :  {0, 1, 2, 0, 1, 2}
    Output : {0, 0, 1, 1, 2, 2}
    
    Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
    Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
    
A simple solution is discussed in below post.
Sort an array of 0s, 1s and 2s (Simple Counting)

The problem is similar to our old post Segregate 0s and 1s in an array, and both of these problems are variation of famous Dutch national flag problem.

The problem was posed with three colours, here `0′, `1′ and `2′. The array is divided into four sections:

a[1..Lo-1] zeroes (red)
a[Lo..Mid-1] ones (white)
a[Mid..Hi] unknown
a[Hi+1..N] twos (blue)
The unknown region is shrunk while maintaining these conditions

Lo := 1; Mid := 1; Hi := N;
while Mid <= Hi do
Invariant: a[1..Lo-1]=0 and a[Lo..Mid-1]=1 and a[Hi+1..N]=2; a[Mid..Hi] are unknown.
case a[Mid] in
0: swap a[Lo] and a[Mid]; Lo++; Mid++
1: Mid++
2: swap a[Mid] and a[Hi]; Hi–
— Dutch National Flag Algorithm, or 3-way Partitioning —

Part way through the process, some red, white and blue elements are known and are in the “right” place. 
The section of unknown elements, a[Mid..Hi], is shrunk by examining a[Mid]:

   <img src="https://cdncontribute.geeksforgeeks.org/wp-content/uploads/list.jpg"/>

    Examine a[Mid]. There are three possibilities: 
    a[Mid] is (0) red, (1) white or (2) blue.
    Case (0) a[Mid] is red, swap a[Lo] and a[Mid]; Lo++; Mid++
    
  <img src="https://cdncontribute.geeksforgeeks.org/wp-content/uploads/list2-1.jpg"/>
  
      Case (1) a[Mid] is white, Mid++
      
  <img src="https://cdncontribute.geeksforgeeks.org/wp-content/uploads/list3.jpg"/>
  
     Case (2) a[Mid] is blue, swap a[Mid] and a[Hi]; Hi--  
   
   <img src="https://cdncontribute.geeksforgeeks.org/wp-content/uploads/list4.jpg"/>
   
     Continue until Mid>Hi. 
     
   Time Complexity: O(n)
   
   The above code performs unnecessary swaps for inputs like 0 0 0 0 1 1 1 2 2 2 2 2 : lo=4 and mid=7 and hi=11. 
   In present code: first 7 exchanged with 11 and hi become 10 and mid is still pointing to 7. again the same operation is done till mid <= hi. 
   But it is really not required. We can change the swap function to do a check that the values being swapped are same or not, if not same, then only swap values.