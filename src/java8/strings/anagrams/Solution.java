package java8.strings.anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = sortAlphabeticallyCaseIgnored(a.toLowerCase());
        b = sortAlphabeticallyCaseIgnored(b.toLowerCase());

        return (a.compareToIgnoreCase(b) == 0 ? true : false);
    }

    private static String sortAlphabeticallyCaseIgnored(String string) {
        char[] toSort = string.toCharArray();
        Arrays.sort(toSort);

        return new String(toSort);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
