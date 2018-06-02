
public class TestStringReversal {

	public static void main(String[] args) {

		
		System.out.println(isRotated("amazon", "azonam") ?  "Yes"
                : "No");
	}
	
	static boolean isRotated(String str1, String str2)
    {
        if (str1.length() != str2.length())
            return false;
      
        String clock_rot = "";
        String anticlock_rot = "";
        int len = str2.length();
      
        // Initialize string as anti-clockwise rotation
        anticlock_rot = anticlock_rot +
                        str2.substring(len-2, len) +
                        str2.substring(0, len-2) ;
      
        // Initialize string as clock wise rotation
        clock_rot = clock_rot +
                    str2.substring(2) +
                    str2.substring(0, 2) ;
      
        // check if any of them is equal to string1
        return (str1.equals(clock_rot) ||
        		str1.equals(anticlock_rot));
    }

}
