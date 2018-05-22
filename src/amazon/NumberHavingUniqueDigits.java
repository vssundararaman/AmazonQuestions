package amazon;

public class NumberHavingUniqueDigits {

    public static void main(String[] args) {
        int l = 1, r = 100;
        printUnique(l, r);
    }

    static void printUnique(int l, int r)
    {
        for(int i = l;i<=r;i++){

            int number = i;
            boolean visted[] = new boolean[10];

            while(number !=0){

               if(visted[number%10]){
                    break;
                }

                visted[number%10] = true;

                number = number/10;
            }

            // num will be 0 only when above loop
            // doesn't get break that means the
            // number is unique so print it.
            if (number == 0){
                System.out.print(i + " ");
            }
        }
    }
}
