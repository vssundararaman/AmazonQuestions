package amazon;

public class CheckANumberIsMultipleOfBNumber {

    public static void main(String[] args) {

        int A = 21;
        int B = 3;

        if(checkNumber(A,B))
        {
            System.out.println("Number " + A + " is Multiple of Number " + B);
        }else{
            System.out.println("Number " + A + " is Not Multiple of Number " + B);
        }

    }

    static boolean checkNumber(int A, int B){

        if(A%B ==0){
            return true;
        }else{
            return false;
        }
    }
}
