package amazon.hard.pgm2018070814;

public class GivenArrayFindTheMaximumJANDI
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,9};
       int maxDiff =  findMaxDiff(arr,arr.length);

        System.out.println(maxDiff);
    }

    static int findMaxDiff(int arr[], int n){

        int maxDiff = -1;

        int i, j;

        for(i = 0; i<n; ++i){

            for(j=n-1; j> i; j--){

                if(arr[j] > arr[i] && maxDiff < (j-i)){

                    maxDiff = j-i;

                }
            }
        }

        return maxDiff;
    }
}
