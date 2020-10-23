package interviewPreparationKit.warmupChallenges.countingValleys;


import java.io.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        boolean wasUnderSeaLevel = false;
        int valleys = 0;
        char[] pathArray = path.toCharArray();
        int track = 0;

        for (int i = 0; i < steps; i++) {
            track = pathArray[i] == 'D' ? track - 1 : track + 1;

            if (track < 0) {
                wasUnderSeaLevel = true;
            } else if (wasUnderSeaLevel) {
                valleys++;
                wasUnderSeaLevel = false;
            }
        }

        return valleys;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

