package amazon.pgm2018070107;

import java.util.Arrays;

public class BinarySearchRecurssive {

    public static void main(String[] args) {

        int[] array = {3, 4, 8, 1, 5, 10, 54, 23, 13};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int result = binarySearchRecurssive(array, 23, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Element found at the Index " + result);
        } else {
            System.out.println("Element not found ");

        }
    }

    static int binarySearchRecurssive(int[] array, int searchElement, int start, int end){

        if(start<=end){

            int mid = start + (end - start)/2;

            if(array[mid] == searchElement){
                return mid;
            }

            if(array[mid]<searchElement){
                return binarySearchRecurssive(array,searchElement,mid+1,end);
            }

            if(array[mid]>searchElement){
                return binarySearchRecurssive(array,searchElement,start,mid-1);
            }
        }

        return  -1;
    }
}
