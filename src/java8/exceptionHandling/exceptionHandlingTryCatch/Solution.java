package java8.exceptionHandling.exceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        String result;

        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            result = "" + x / y;
        } catch (InputMismatchException e) {
            result = "java.util.InputMismatchException";
        } catch (ArithmeticException e) {
            result = "java.lang.ArithmeticException: / by zero";
        }

        System.out.println(result);
        scanner.close();
    }
}
