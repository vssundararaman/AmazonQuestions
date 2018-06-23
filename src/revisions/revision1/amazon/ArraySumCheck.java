/**
 * @author Selva
 * @version Revision_1.0
 * 
 * 
 * 
 */
package revisions.revision1.amazon;

import java.util.Arrays;

public class ArraySumCheck {

	public static void main(String[] args) {

		int [] inputArr = {2,4,3,7,5};
		int sum = 12;
		
		findSumInArr(inputArr, sum);
	}

	private static void findSumInArr(int[] inputArr, int sum) {
		
		Arrays.sort(inputArr);
		
		int left = 0, right = inputArr.length - 1;
		
		while(left < right) {
			
			if(inputArr[left] + inputArr[right] == sum ) {
				System.out.println(inputArr[left] + " and " + inputArr[right]);
				return;
			}
			else if (inputArr[left] + inputArr[right] < sum) {
				left ++;
			}
			else {
				right --;
			}
		}
		
	}

}
