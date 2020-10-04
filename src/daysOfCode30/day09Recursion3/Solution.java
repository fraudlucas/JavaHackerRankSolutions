package daysOfCode30.day09Recursion3;

public class Solution {
    static int factorial(int n) {

        if (n > 1) {
            return n * factorial(n - 1);
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
