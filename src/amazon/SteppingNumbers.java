package amazon;

/**
 * Brute force Approach
 */
public class SteppingNumbers {

    // A brute force approach based function to find all
    // stepping numbers.
    public static void main(String[] args) {

        // Iterate through all the numbers from [N,M]
        // and check if it is a stepping number.
        for (int i = 1; i <= 500; i++){
            if (isSteppingNumber(i)){
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isSteppingNumber(int number){

        int previoutDigit = -1;

        while (number >0){

            int currentDigit = number % 10;

            if(previoutDigit !=-1){
                if(Math.abs(currentDigit - previoutDigit) !=1){
                    return false;
                }
            }

            number /=10;

            previoutDigit = currentDigit;
        }

        return true;
    }
}
