import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {

        if(findValue("324","en_IT")){
            System.out.println("Value is there");
        }else{
            System.out.println("Value is Not there");
        }

        if(findValue("326","en_IM")){
            System.out.println("Value is there");
        }else{
            System.out.println("Value is Not there");
        }
    }

    static boolean findValue(String siteId, String locale) {

        Map<String, String> myMap = new HashMap<String, String>();

        String consent = "342:[en_UK, en_IT], 341:[it_IT, en_IT], 351:[de_DE, it_IT], 325:[en_UK, en_IT], 324:[en_UK, en_IT], 326:[en_UK, en_IT], 327:[en_UK, en_IT], 352:[en_UK, en_IT], 370:[en_UK, en_IT], 238:[en_US, en_IT]";


        String[] pairs = consent.split("],");
        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i];
            String[] keyValue = pair.split(":");
            myMap.put(keyValue[0].trim(), keyValue[1].replace("[",""));
        }

        //System.out.println(myMap.values());



        if(myMap.containsKey(siteId)){

            Map<String, Boolean> newMap = new HashMap<String,Boolean>();

            for(String value:myMap.values()){
                String localeVal = value;
                String[] splitValue = localeVal.split(",");
                newMap.put(splitValue[0].trim(),Boolean.TRUE);
            }

            System.out.println(" ------  " + newMap);


           if(myMap.get(siteId).contains(locale)){
               return true;
           }
        }


        return false;
    }

}
