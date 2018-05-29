package amazon.hard;

public class NQueenProblem {

     final int N = 4;

    public static void main(String[] args) {

        NQueenProblem nQueenProblem = new NQueenProblem();

        int board[][] = {{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};

       if(nQueenProblem.solveNQueenProblem(board,0)==false){
           System.out.println("Solution does not exist");
           return;
       }
        nQueenProblem.printSolution(board);
    }


    boolean solveNQueenProblem(int board[][], int col){

        //If All Queens are placed then This returns true
        if(col >= N){
            return true;
        }

        /*
            Consider this column and try placing
            this queen in all rows one by one
         */
        for(int row=0;row<N;row++){

            if(isSafe(board,row,col)){
                board[row][col] = 1;

                if(solveNQueenProblem(board,col+1)==true){
                    return true;
                }

                board[row][col] = 0;
            }

        }


        return false;
    }


    boolean isSafe(int board[][], int row, int col){

        int i,j;

        //Check this row on left side
        for(i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }

        //Check upper diagonal on left side
        for(i=row,j=col; i>=0 && j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        //Check lower diagonal on left side
        for(i=row,j=col; j>=0 && i<N;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        return true;
    }

    void printSolution(int board[][]){

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(" " + board[i][j]);
            }
            System.out.println("");
        }

    }
}
