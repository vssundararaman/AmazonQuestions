package amazon.pgmmayjune;

public class Palindrome {

	public static void main(String[] args) {

		String test = "MalayalaM";
		String reverse = "";
		char[] testChar = test.toCharArray();
		int size = test.length();
		char[] reverseChar = new char[size];
		
		for(int i=testChar.length-1; i>=0; i--) {
			for(int j=0; j<size; j++) {
				reverse += testChar[i];
				reverseChar[j] = testChar[i];
			}
		}
		
		if(test.equals(reverse)) {
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}
		
	}

}
