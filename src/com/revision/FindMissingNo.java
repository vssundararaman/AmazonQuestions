package com.revision;

public class FindMissingNo {

    public static void main(String[] args) {

        int[] arr1={7,5,6,1,4,2,8,3,9,10,12};

        System.out.println("Missing Number is " + getMissingNumber(arr1));

    }

    static int getMissingNumber(int[] array){

        int total, size, sum=0;
        size = array.length;

        total = (size+1)*(size+2)/2;

        for(int value:array){
            sum +=value;
        }

        return total - sum;
    }
}
