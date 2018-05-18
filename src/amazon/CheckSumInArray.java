package amazon;

import java.util.Arrays;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 *
 */
public class CheckSumInArray {

    public static void main(String[] args) {

        int[] numberArray = {-10,-34,23,9,6,12,48,3,2,5,7,4};

        int number = 18;

        System.out.println("The Array has the candidates with Sum of 18 is " + hasArrayTwoCandidates(numberArray,number) );

    }


    static boolean hasArrayTwoCandidates(int [] array, int number){

       Arrays.sort(array);

        int start = 0;
        int end = array.length-1;

        while(start<end){

            if(array[start]+array[end]==number){
                return true;
            }else if(array[start]+array[end]>number){
                end--;
            }else if(array[start]+array[end]<number){
                start++;
            }
        }

        return false;
    }

}

