package amazon.pgmmayjune;

public class ReverseString {

    public static void main(String[] args) {

        String originalString = "Executing...Words";

        System.out.println(originalString);

        System.out.println(reverseAWordinString(originalString));
    }

    static String reverseAWordinString(String originalString){

        char[] charArr = originalString.toCharArray();
        String reverseString="";

        for(int i = charArr.length-1 ;i>=0;i--){
            reverseString +=charArr[i];
        }

        return reverseString;
    }
}
