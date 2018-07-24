package amazon.pgm2018072228;

import java.util.HashMap;
import java.util.Map;

public class GroupAndCountCharsinString {

    public static void main(String[] args) {

        groupAndCharsInString("Sundararaman");
    }

    static  void groupAndCharsInString(String words){

        Map<String, Long> charCount = new HashMap<>();

        for(char character: words.toLowerCase().toCharArray()){

            String charAsString  =Character.toString(character);

            if(charCount.containsKey(charAsString)){
                long value = charCount.get(charAsString) +1;
                charCount.put(charAsString, value);
            }else{
                charCount.put(charAsString, 1L);
            }
            }
        System.out.println(charCount);
    }



}
