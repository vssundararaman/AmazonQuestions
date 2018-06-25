package fundamental.search;

import java.util.Arrays;

public class BinarySearchRecursive {

    public static void main(String[] args) {

        int[] numberArray = {3,4,5};

        Arrays.sort(numberArray);


        int result = binarySearch(numberArray, 5,0,numberArray.length-1);

        if(result == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at index " + result);
        }
    }

    static int binarySearch(int[] array, int searchElement, int start, int end){

        if(start<= end){

            int mid = start + (end-start)/2;

            if(array[mid] == searchElement){
                return mid;
            }

            if(array[mid] > searchElement){
               return binarySearch(array,searchElement,start, mid-1);
            }

            if(array[mid] < searchElement){
                return binarySearch(array, searchElement, mid+1,end);
            }
        }

        return -1;
    }
}
