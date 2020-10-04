package java8.dataStructures.subarray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int negativeSubarrays = amountOfNegativeSubarrays(array);

        System.out.println(negativeSubarrays);
    }

    private static int amountOfNegativeSubarrays(int[] array) {
        int negatives = 0;

        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j + i <= array.length; j++) {
                int sum = subarraySum(Arrays.copyOfRange(array, j, j + i));
                if (sum < 0) {
                    negatives++;
                }
            }
        }

        return negatives;
    }

    private static int subarraySum(int[] subarray) {
        int result = 0;

        for (int element : subarray) {
            result += element;
        }

        return result;
    }
}
