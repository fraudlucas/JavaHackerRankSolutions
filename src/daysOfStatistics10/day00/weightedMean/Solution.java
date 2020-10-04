package daysOfStatistics10.day00.weightedMean;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] integers = new int[n];

        for (int i = 0; i < n; i++) {
            integers[i] = scanner.nextInt();
        }

        int weightsSum = 0;
        int integersWeightedSum = 0;

        for (int i = 0; i < n; i++) {
            int weight = scanner.nextInt();
            integersWeightedSum += integers[i] * weight;
            weightsSum += weight;
        }

        float weightedMean = (float) integersWeightedSum / weightsSum;

        System.out.printf("%.1f\n", weightedMean);

        scanner.close();
    }
}
