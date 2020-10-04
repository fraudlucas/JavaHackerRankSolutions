package java8.bigNumber.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueA = scanner.next();
        String valueB = scanner.next();

        BigInteger bigA = new BigInteger(valueA);
        BigInteger bigB = new BigInteger(valueB);

        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));

        scanner.close();
    }
}
