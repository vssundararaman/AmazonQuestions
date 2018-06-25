package revisions.revision1.amazon;

public class SortZeroOneTwoArr {

	public static void main(String[] args) {

		int[] inputArr = {0,2,1,0,1,2,0};
		sortZeroOneTwo(inputArr);
		
	}

	private static void sortZeroOneTwo(int[] inputArr) {

		int low = 0, mid = 0, high = inputArr.length-1, temp = 0;
		
		while(mid <= high) {
			switch (inputArr[mid]) {
			case 0:
				temp = inputArr[low];
				inputArr[low] = inputArr[mid];
				inputArr[mid] = temp;
			low++;
			mid++;	
			break;
			
			case 1:
			mid++;
			break;
			
			case 2:
				temp = inputArr[mid];
				inputArr[mid] = inputArr[high];
				inputArr[high] = temp;
			high--;
			break;
			}
		}
		
		printArr(inputArr);
	}

	private static void printArr(int[] inputArr) {

		for(int i=0; i< inputArr.length; i++) {
			System.out.print(" " + inputArr[i] + " ");
		}
	}

}
