package daysOfCode30.day29BitwiseAND;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int result = maximumPossibleFromArrayToIntegerK(n, k);

            System.out.println(result);
        }

        scanner.close();
    }

    private static int maximumPossibleFromArrayToIntegerK(int arrayLastElement, int k) {
        int maximumPossible = 1 & 2;

        for (int i = 1; i < arrayLastElement; i++) {
            for (int j = i+1; j <= arrayLastElement; j++) {
                int currentAND = i & j;

                if (currentAND > maximumPossible && currentAND < k) {
                    maximumPossible = currentAND;
                }
            }
        }

        return maximumPossible;
    }
}
