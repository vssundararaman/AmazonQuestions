package amazon;

public class TwoElementsWhoseSumIsClosestToZero {

    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -451, 462};
        minAbsSumPair(arr);
    }

    static void minAbsSumPair(int[] array){

        int array_size = array.length;
        int inv_count = 0;
        int l,r, min_sum,   sum, min_l, min_r;

        //Initialize the values
        min_l = 0;
        min_r = 1;
        min_sum = array[0]+array[1];

        for(l=0;l<array_size-1;l++){
            for(r = l+1;r<array_size;r++){

                sum = array[l]+array[r];

                if(Math.abs(min_sum) > Math.abs(sum))
                {
                    min_sum = sum;
                    min_l = l;
                    min_r = r;
                }
            }
        }

        System.out.println(" The two elements whose "+
                "sum is minimum are "+
                array[min_l]+ " and "+array[min_r]);


    }

}
