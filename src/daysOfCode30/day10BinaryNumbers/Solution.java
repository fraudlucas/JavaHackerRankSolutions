package daysOfCode30.day10BinaryNumbers;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(maximumConsecutive1sFromBinaryOf(n));

        scanner.close();
    }

    public static int maximumConsecutive1sFromBinaryOf(int n) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;

            if (remainder == 1) {
                currentConsecutiveOnes += 1;
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
            } else {
                currentConsecutiveOnes = 0;
            }

        }

        return maxConsecutiveOnes;
    }

}
