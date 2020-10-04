package java8.introduction.endOfFile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(i + " " + scanner.nextLine());
            i = i + 1;
        }

        scanner.close();
    }
}
