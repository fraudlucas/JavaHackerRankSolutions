package java8.dataStructures.array2D;

import java.util.Scanner;

public class Solution {

    private static int highestHourglassSum(int[][] array) {
        int rowLimit = array.length - 3;
        int columnLimit = array[0].length - 3;
        int highestHourglass = Integer.MIN_VALUE;
        int hourglass;

        for (int r = 0; r <= rowLimit; r++) {
            for (int c = 0; c <= columnLimit; c++) {
                hourglass = array[r][c] + array[r][c+1] + array[r][c+2];
                hourglass += array[r+1][c+1];
                hourglass += array[r+2][c] + array[r+2][c+1] + array[r+2][c+2];

                if (hourglass > highestHourglass) {
                    highestHourglass = hourglass;
                }
            }
        }

        return highestHourglass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int result = highestHourglassSum(arr);

        System.out.println(result);
    }
}

