package java8.strings.stringReverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder sb = new StringBuilder(A);

        if (A.compareTo(sb.reverse().toString()) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
