package daysOfStatistics10.day00.meanMedianAndMode;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        float sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        Arrays.sort(array);

        float mean = sum / n;
        float median = getMedianFromSortedArray(array);
        int mode = getModeFromSortedArray(array);

        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.println(mode);
    }

    private static float getMedianFromSortedArray(int[] array) {
        int n = array.length;
        float median;
        int middleIndex = n / 2;

        if (n % 2 == 0) {
            median = (float) (array[middleIndex] + array[middleIndex - 1]) / 2;
        } else {
            median = array[middleIndex];
        }

        return median;
    }

    private static int getModeFromSortedArray(int[] array) {
        int n = array.length;
        int currentMode = array[0];
        int mode = currentMode;
        int modeCount = 1;
        int currentCount = modeCount;

        for (int i = 1; i < n; i++) {
            if (array[i] == currentMode) {
                currentCount++;
            } else {
                currentMode = array[i];
                currentCount = 1;
            }

            if (currentCount > modeCount) {
                modeCount = currentCount;
                mode = array[i];
            }
        }

        return mode;
    }
}
