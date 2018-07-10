package amazon.pgmmayjune;

import java.util.regex.Pattern;

public class ReverseWordsinString {

    public static void main(String[] args) {

        String str = "I love Java Programming";

        System.out.println(reverseString(str));
    }

    static String reverseString(String originalString){

        Pattern pattern = Pattern.compile("\\s");

        String[] tempStr = pattern.split(originalString);
        String result="";

        for(int i=0;i<tempStr.length;i++){
           if(i == tempStr.length-1){
               result = tempStr[i]+ result;
           }else {
                result = " " + tempStr[i] + result;
           }
        }

        return result;
    }
}
