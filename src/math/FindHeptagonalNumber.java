package math;

public class FindHeptagonalNumber {

    public static void main(String[] args) {

        int n = 2;
        System.out.println(heptagonalNumber(n));

        n = 17;
        System.out.println(heptagonalNumber(n));
    }

    static int heptagonalNumber(int n){

        return ((5 * n * n)-(3 * n))/2;

    }
}

