package amazon.pgmmayjune;

/**
 * You are given a list of n-1 integers and these integers are in the range of 1 to n.
 * There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
 *
 * 1. Get the sum of numbers
 *        total = n*(n+1)/2
 * 2  Subtract all the numbers from sum and
 *    you will get the missing number.
 *
 */
public class FindMissingNumber {

    public static void main(String[] args) {


        int[] arr1={7,5,6,1,4,2};

        System.out.println("Missing Number is " + getMissingNumber(arr1));
 //       getMissingNumber(arr1);
    }


    static int getMissingNumber(int[] array){
        int result = 0;

        int n = array.length+1;
        int arraySum = 0;
        int totalSum = n*(n+1)/2;
        System.out.println(" total " + totalSum);

        for(int value:array){
            arraySum +=value;
        }

        result = totalSum - arraySum;

        return result;
    }

}
