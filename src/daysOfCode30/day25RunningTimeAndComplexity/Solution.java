package daysOfCode30.day25RunningTimeAndComplexity;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            int number = scanner.nextInt();
            String result = (isPrime(number) == true) ? "Prime" : "Not prime";
            System.out.println(result);
        }
        ;

        scanner.close();
    }

    private static boolean isPrime(int number) {
        int count = 0;

        if (number == 3 || number == 2) {
            printStats(++count, number, true);
            return true;
        }
        if (number % 2 == 0 || number == 1) {
            printStats(++count, number, false);
            return false;
        }

        int aThird = number / 3;
        int squareRoot = (int) Math.sqrt(number);

        for (int i = 3; i <= squareRoot; i += 2) {
            count++;
            if (number % i == 0) {
                printStats(++count, number, false);
                return false;
            }
        }

        printStats(++count, number, true);
        return true;
    }

    private static void printStats(int count, int n, boolean isPrime) {
        String caller = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.err.println(caller + " performed " + count + " checks, determined " + n
                + ((isPrime) ? " is PRIME." : " is NOT PRIME."));
    }
}
