package daysOfCode30.day05Loops;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            int result = n * multiplier;
            System.out.println(n + " x " + multiplier + " = " + result);
        }
    }
}
