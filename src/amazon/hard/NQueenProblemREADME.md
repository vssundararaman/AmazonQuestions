Let us discuss N Queen as another example problem that can be solved using Backtracking.

The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other. For example, following is a solution for 4 Queen problem.

<img src="https://cdncontribute.geeksforgeeks.org/wp-content/uploads/N_Queen_Problem.jpg" />

The expected output is a binary matrix which has 1s for the blocks where queens are placed. For example, following is the output matrix for above 4 queen solution.

              { 0,  1,  0,  0}
              { 0,  0,  0,  1}
              { 1,  0,  0,  0}
              { 0,  0,  1,  0}


Naive Algorithm
Generate all possible configurations of queens on board and print a configuration that satisfies the given constraints.

    while there are untried conflagrations
    {
       generate the next configuration
       if queens don't attack in this configuration then
       {
          print this configuration;
       }
    }
Backtracking Algorithm
The idea is to place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column, we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark this row and column as part of the solution. If we do not find such a row due to clashes then we backtrack and return false.

    1) Start in the leftmost column
    2) If all queens are placed
        return true
    3) Try all rows in the current column.  Do following for every tried row.
        a) If the queen can be placed safely in this row then mark this [row, 
            column] as part of the solution and recursively check if placing  
            queen here leads to a solution.
        b) If placing the queen in [row, column] leads to a solution then return 
            true.
        c) If placing queen doesn't lead to a solution then umark this [row, 
            column] (Backtrack) and go to step (a) to try other rows.
    3) If all rows have been tried and nothing worked, return false to trigger 
        backtracking.
