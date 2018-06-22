package fundamental.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numberArray = {4,5,8,9,2,4,5,221,456,75,451,65,521,45};

        int result = linearSearch(numberArray, 75);

        if(result ==-1)
            System.out.println("Element not Found");
        else
            System.out.println("Element found at the Index " + result);
    }

    static int linearSearch(int[] array, int searchElement){

        for(int i=0; i<array.length;i++){

            if(array[i]==searchElement){
                return i;
            }
        }

        return  -1;
    }
}
