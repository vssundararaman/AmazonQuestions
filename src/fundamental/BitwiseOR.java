package fundamental;

public class BitwiseOR {

    public static void main(String[] args) {

        int num1 = 42;
        int num2 = 15;

        System.out.println(" Binary Number "+ Integer.toBinaryString(num1));

        System.out.println(" Binary Number "+ Integer.toBinaryString(num2));

        System.out.println("OR Result = " +(num1 | num2));

        System.out.println("XOR Result = " +(num1 ^ num2));


        for(int i=0;i<100;i++){
           System.out.println(" Binary Number " + i + " is " + Integer.toBinaryString(i));
        }

    }
}
