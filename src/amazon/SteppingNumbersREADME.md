Stepping Numbers
Given two integers ‘n’ and ‘m’, find all the stepping numbers in range [n, m]. A number is called stepping number if all adjacent digits have an absolute difference of 1. 321 is a Stepping Number while 421 is not.

Examples :

Input : n = 0, m = 21
Output : 0 1 2 3 4 5 6 7 8 9 10 12 21

Input : n = 10, m = 15
Output : 10, 12

Method 1 : Brute force Approach

In this method, a brute force approach is used to iterate through all the integers from n to m and check if it’s a stepping number.

Output :
0 1 2 3 4 5 6 7 8 9 10 12 21 