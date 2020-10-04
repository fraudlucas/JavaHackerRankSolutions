package daysOfCode30.day19Interfaces;


import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class AdvancedCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int divisor = n;
        int sum = 0;

        do {
            if (n % divisor == 0) {
                sum += divisor;
            }
            divisor -= 1;
        } while (divisor > 0);

        return sum;
    }
}


class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new AdvancedCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }

}
