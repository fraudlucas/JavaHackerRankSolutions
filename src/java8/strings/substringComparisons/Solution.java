package java8.strings.substringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int totalChars = s.length() - k;

        for (int i = 1; i <= totalChars; i++) {
            s = s.substring(1);

            String chunkToCompare = s.substring(0, k);

            if (smallest.compareTo(chunkToCompare) > 0) {
                smallest = chunkToCompare;
            } else if (largest.compareTo(chunkToCompare) < 0) {
                largest = chunkToCompare;
            }

        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
