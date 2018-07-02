package amazon.pgm2018070107;

import java.util.Arrays;


//Search an element in a sorted and rotated array

public class BinarySearchIterative {

    public static void main(String[] args) {

        int[] array = {3,4,8,1,5,10,54,23,13};

        int result = binarySearch(array,23);

        if(result !=-1){
            System.out.println("Element found at the Index " + result);
        }else{
            System.out.println("Element not found ");
        }

    }

    static int binarySearch(int[] array, int searchElement){

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int start = 0;
        int end = array.length-1;

        while (start <= end) {

            int mid = start + (end-start)/2;

            if(array[mid] == searchElement){
                return mid;
            }

            if(array[mid]<searchElement){
                start = mid +1;
            }

            if(array[mid]>searchElement){
                end = mid -1;
            }
        }

        return -1;
    }
}
