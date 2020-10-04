package daysOfCode30.day06LetsReview;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        while (testCases > 0) {
            String notDivided = scanner.nextLine();
            String evenIndexed = new String();
            String oddIndexed = new String();

            for (int i = 0; i < notDivided.length(); i++) {
                if (i % 2 == 0) {
                    evenIndexed = evenIndexed + "" + notDivided.charAt(i);
                } else {
                    oddIndexed = oddIndexed + "" + notDivided.charAt(i);
                }
            }

            System.out.println(evenIndexed + " " + oddIndexed);

            testCases -= 1;
        }

        scanner.close();
    }
}
