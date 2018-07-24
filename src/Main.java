import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[])
    {
        String data1 = "Searching in words : java javap myjava myjavaprogram";

        String regex = "java";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(data1);
        while (matcher.find())
        {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }




        String s1="be proud to be an indian";
        char ch=s1.charAt(s1.indexOf('n'));
        int count = 0;
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)=='n'){
                System.out.println("number of E:=="+ch);
                count++;
            }
        }
        System.out.println("Total count of E:=="+count);

    }
}
