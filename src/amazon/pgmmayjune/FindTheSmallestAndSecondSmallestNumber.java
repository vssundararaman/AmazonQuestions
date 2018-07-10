package amazon.pgmmayjune;

public class FindTheSmallestAndSecondSmallestNumber {

    public static void main(String[] args) {
        System.out.println("Executing...");
        int[] numberArray = {45,65,12,-5,10,89,45,5};

        print2SmallestNumbers(numberArray);
    }


    static void print2SmallestNumbers(int[] array){

        int first_element, second_element, array_size = array.length;

        /* There should be atleast two elements */
        if(array_size<2){
            System.out.println("Array should have more than 2 elements");
            return;
        }

        first_element = second_element = Integer.MAX_VALUE;

        for(int i= 0; i<array_size;i++){

            if(array[i]<first_element){
                second_element = first_element;
                first_element = array[i];
            }

            if(array[i]<second_element && array[i] !=first_element){
                second_element = array[i];
            }
        }
        if(second_element == Integer.MAX_VALUE){
            System.out.println("There is No Second Large Element found in the Array");
        }
        else{
            System.out.println("The smallest element is " +
                    first_element + " and second Smallest" +
                    " element is " + second_element);
        }


    }
}
