package interviewPreparationKit.arrays.arraysLeftRotation;


import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int[] result = new int[length];

        for (int j = 0; j < d; j++) {
            int index = length - d + j;
            result[index] = a[j];
        }

        for (int k = d; k < length; k++) {
            int index = k - d;
            result[index] = a[k];
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();

        int d = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] result = rotLeft(a, d);

        for (int j : result) {
            System.out.print(j + " ");
        }

        scanner.close();
    }
}

