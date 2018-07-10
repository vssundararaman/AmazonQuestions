package amazon.pgmmayjune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class squareChecker {

	public static void main(String[] args) {

		//straight square
		/*int[] firstPt = new int[]{1,3};
		int[] secondPt = new int[]{1,1};
		int[] thirdPt = new int[]{3,3};
		int[] forthPt =new int[]{3,1};*/
		
		int[] Pt1 = new int[]{3,3};
		int[] Pt2 = new int[]{2,4};
		int[] Pt3 = new int[]{2,2};
		int[] Pt4 =new int[]{1,3};
		
		int[] listOfArr = orderPoints(Pt1, Pt2, Pt3, Pt4);
		
		int[] firstPt = new int[2];
		int[] secondPt = new int[2];
		int[] thirdPt = new int[2];
		int[] forthPt = new int[2];
		
		firstPt = stringToArray(String.valueOf(listOfArr[0]));
		secondPt = stringToArray(String.valueOf(listOfArr[1]));
		thirdPt = stringToArray(String.valueOf(listOfArr[2]));
		forthPt = stringToArray(String.valueOf(listOfArr[3]));
		
		int[] diagonal1 = diffOfArrays(firstPt, forthPt);
		int[] diagonal2 = diffOfArrays(secondPt, thirdPt);
		int[] verticalSide = diffOfArrays(firstPt, thirdPt);
		int[] horizontalSide = diffOfArrays(firstPt, secondPt);
		int[] verticalSide2 = diffOfArrays(secondPt, forthPt);
		int[] horizontalSide2 = diffOfArrays(thirdPt, forthPt);
		
		if((Arrays.toString(diagonal1).equals(Arrays.toString(sumOfArrays(verticalSide, horizontalSide)))) &&
				(Arrays.toString(diagonal1).equals(Arrays.toString(sumOfArrays(verticalSide2, horizontalSide2))))){
			System.out.println("A square placed straight is possible");
		}
		else if((Arrays.toString(sumOfArrays(diagonal1, diagonal2)).equals(Arrays.toString(sumOfArrays(verticalSide, horizontalSide)))) &&
				(Arrays.toString(sumOfArrays(diagonal1, diagonal2)).equals(Arrays.toString(sumOfArrays(verticalSide2, horizontalSide2))))){
			System.out.println("A square placed sideways is possible");
		}
		else {
			System.out.println("Square is not possible");
		}
		
	}
	
	private static int[] orderPoints(int[] pt1, int[] pt2, int[] pt3,
			int[] pt4) {
		
		int[] objArr = new int[4];
		
		int num1 = 0;
		for (int a : pt1) {
		  num1 = 10*num1 + a;
		}
		
		objArr[0] = num1;
		
		int num2 = 0;
		for (int a : pt2) {
			num2 = 10*num2 + a;
		}
		objArr[1] = num2;
		int num3 = 0;
		for (int a : pt3) {
			num3 = 10*num3 + a;
		}
		objArr[2] = num3;
		int num4 = 0;
		for (int a : pt4) {
			num4 = 10*num4 + a;
		}
		objArr[3] = num4;
		Arrays.sort(objArr);
		return objArr;
	}

	static int[] diffOfArrays(int[] first, int[] second){
		
		int[] diffArr = new int[first.length];
		int num = 0;
		
		for(int j=0; j<first.length; j++) {
			if(first[j] > second[j]) {
				num = first[j] - second[j];
			}
			else {
				num = second[j] - first[j];
			}
			diffArr[j]=num;
		}
		return diffArr;
	}
	
	static int[] sumOfArrays(int[] first, int[] second){
		
		int[] sumArr = new int[first.length];
		int num = 0;
		
		for(int j=0; j<first.length; j++) {
			num = first[j] + second[j];
			sumArr[j]=num;
		}
		return sumArr;
	}
	
	static int[] stringToArray(String numString) {
		int[] outputArr = new int[2];
		char[] charArr = numString.toCharArray();
		for (int c=0; c<charArr.length; c++) {
			outputArr[c] = (int)charArr[c];
		}
		return outputArr;
		
	}
	
	static String arrayToString(int[] inputArr) {
		inputArr = new int[2];
		String arrayString = new String();
		for (int c=0; c<inputArr.length; c++) {
			arrayString += (char)inputArr[c];
		}
		return arrayString;
		
	}
	
}
