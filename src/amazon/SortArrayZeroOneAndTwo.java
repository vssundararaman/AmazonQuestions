package amazon;

public class SortArrayZeroOneAndTwo {

    public static void main(String[] args) {

        //int arr[] = {0,1,2,1,0,2,1,1,2,0,0,0,1};

        int arr[] = {1,0,2};

        sortArray(arr);

        printArray(arr);
    }

    static void sortArray(int [] array){

        int lo=0;
        int mid = 0, high=array.length-1, temp=0;

        while(mid<=high){

            switch (array[mid]){

                case 0:
                {
                    temp = array[lo];
                    array[lo] = array[mid];
                    array[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                {
                    temp = array[mid];
                    array[mid]=array[high];
                    array[high]=temp;
                    high--;
                    break;
                }
            }



        }

    }

    static void printArray(int[] array){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
}
