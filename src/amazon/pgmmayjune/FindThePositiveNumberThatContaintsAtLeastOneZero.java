package amazon.pgmmayjune;

public class FindThePositiveNumberThatContaintsAtLeastOneZero {

    public static void main(String[] args) {
        int d = 1;
        System.out.println(findCount(d));

        d=2;
        System.out.println(findCount(d));

        d=3;
        System.out.println(findCount(d));

        d=4;
        System.out.println(findCount(d));
    }

    static int findCount(int d){
        return 9 * ((int)(Math.pow(10,d-1))
                    -(int)(Math.pow(9,d-1)));
    }
}
