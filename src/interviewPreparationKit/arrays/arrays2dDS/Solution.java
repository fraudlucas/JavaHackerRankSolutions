package interviewPreparationKit.arrays.arrays2dDS;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int rowLimit = arr.length - 3;
        int columnLimit = arr[0].length - 3;
        int highestHourglass = Integer.MIN_VALUE;
        int hourglass;

        for (int r = 0; r <= rowLimit; r++) {
            for (int c = 0; c <= columnLimit; c++) {
                hourglass = arr[r][c] + arr[r][c+1] + arr[r][c+2];
                hourglass += arr[r+1][c+1];
                hourglass += arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];

                if (hourglass > highestHourglass) {
                    highestHourglass = hourglass;
                }
            }
        }

        return highestHourglass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
