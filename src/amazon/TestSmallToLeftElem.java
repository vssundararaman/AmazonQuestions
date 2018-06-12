package amazon;

public class TestSmallToLeftElem {

	public static void main(String[] args) {

		int[] arr = {2,6,4,1,7};
		System.out.print("{_,");
		// Start from second element
	    for (int i=1; i<arr.length; i++)
	    {
	        // look for smaller element on left of 'i'
	        int j;
	        for (j=i-1; j>=0; j--)
	        {
	            if (arr[j] < arr[i])
	            {
	                System.out.print(arr[j]);
	                if(i==arr.length-1) {
	                	
	                }
	                else {
	                	System.out.print(", ");
	                }
	                break;
	            }
	        }
	        // If there is no smaller element on left of 'i'
	        if (j == -1) {
	        	System.out.print( "_, ");
	        }

	    }
	    System.out.print("}");
	}

}
