package refreshaday.day20181108;

import java.util.HashSet;

public class FindDuplicateArray {

    public static void main(String[] args) {
        DuplicateStringArray();

        FindDuplicateUsingSet();
    }

    //Big O Notation - O(n)
    private static void FindDuplicateUsingSet() {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
        HashSet<String> set = new HashSet<String>();
        for (String arrayElement : strArray) {
            if (!set.add(arrayElement)) {
                System.out.println("Duplicate Element is : " + arrayElement);
            }
        }
    }

    //Big O Notation - O(n^2)
    private static void DuplicateStringArray() {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};

        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if ((strArray[i].equals(strArray[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + strArray[j]);
                }
            }
        }
    }


}
