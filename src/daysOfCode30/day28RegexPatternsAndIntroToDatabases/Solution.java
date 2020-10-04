package daysOfCode30.day28RegexPatternsAndIntroToDatabases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> peopleList = new ArrayList<>();
        String regex = "^[a-z.]+@gmail\\.com$";

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if (emailID.matches(regex)) {
                peopleList.add(firstName);
            }
        }

        Collections.sort(peopleList);

        for (String person : peopleList) {
            System.out.println(person);
        }

        scanner.close();
    }
}
