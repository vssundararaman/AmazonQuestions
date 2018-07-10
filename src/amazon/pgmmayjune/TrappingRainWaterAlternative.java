package amazon.pgmmayjune;

public class TrappingRainWaterAlternative {

    public static void main(String[] args) {
        int arr[] = {2,0,2};
        int n = arr.length;

        System.out.println("Maximum water that "
                + "can be accumulated is "
                + findWater(arr, n));
    }

    static int findWater(int arr[], int n){

        int result=0;

        //maximum element on left and right
        int left_max=0, right_max=0;

        // indices to traverse the array
        int low = 0, high=n-1;

        while(low <=high){

            if(arr[low] < arr[high]){
                if(arr[low] > left_max){
                    // update max in left
                    left_max = arr[low];
                }else{
                    // water on curr element =
                    // max - curr
                    result += left_max -arr[low];
                    low++;
                }
            }else{

                if(arr[high]>right_max){
                    // update right maximum
                    right_max = arr[high];
                }else{
                    result += right_max -arr[high];
                    high--;
                }
            }
        }

        return result;
    }



}
