package amazon.pgmmayjune;

public class FindMissingNumbers {

    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23 };
        findMissingNumbers(a, 0, 25);
    }

    static void findMissingNumbers(int[] a, int first, int last) {
        // before the array: numbers between first and a[0]-1
        for (int i = first; i < a[0]; i++) {
            System.out.println(i);
        }
        // inside the array: at index i, a number is missing if it is between a[i-1]+1 and a[i]-1
        for (int i = 1; i < a.length; i++) {
            for (int j = 1+a[i-1]; j < a[i]; j++) {
                System.out.println(j);
            }
        }
        // after the array: numbers between a[a.length-1] and last
        for (int i = 1+a[a.length-1]; i <= last; i++) {
            System.out.println(i);
        }
    }
}
