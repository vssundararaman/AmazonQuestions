package amazon;

public class TrappingRainWater {

    static int arr[] = {2,0,2};

    public static void main(String[] args) {
        System.out.println("Maximum water that can be accumulated is " +
                findWater(arr.length));
    }

    static int findWater(int n){


        //left[i] contains height of the tallest bar to the left i'th bar including itself.
        int left[] = new int[n];

        //right[i] contains height of the tallest bar to the right i'th bar including itself
        int right[] = new int[n];

        int water = 0;

        left[0] = arr[0];
        // Fill the left array
        for(int i=1;i<n;i++){
                left[i] = Math.max(left[i-1],arr[i]);
        }

        right[n-1]=arr[n-1];
        // Fill the right array
        for(int i = n-2; i>= 0; i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i].
        for(int i=0;i<n;i++){
            water +=Math.min(left[i],right[i]-arr[i]);
        }

        return water;
    }

}
