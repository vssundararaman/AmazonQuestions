package amazon.hard.pgm2018070814;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class ArrangeGivenNumberToFormLargestNumber {

    public static void main(String[] args) {
        Vector<String> arr;
        arr = new Vector<>();

        arr.add("54");
        arr.add("123");
        arr.add("32");

        printLargest(arr);

    }

    // The main function that prints the
    // arrangement with the largest value.
    // The function accepts a vector of strings
    static void printLargest(Vector<String> arr){

        Collections.sort(arr, new Comparator<String>(){

            @Override
            public int compare(String X, String Y) {

                // first append Y at the end of X
                String XY = X + Y;

                // then append X at the end of Y
                String YX = Y + X ;

                // Now see which of the two formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1:1;
            }
        });

        Iterator it = arr.iterator();

        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
