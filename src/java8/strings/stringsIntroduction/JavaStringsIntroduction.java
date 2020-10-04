package java8.strings.stringsIntroduction;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();

        System.out.println(A.length() + B.length());
        System.out.println((A.compareToIgnoreCase(B) <= 0 ? "No" : "Yes"));

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);

    }
}
