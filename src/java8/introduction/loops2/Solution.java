package java8.introduction.loops2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            System.out.println(calculateSeries(a, b, n));
        }
        in.close();
    }

    private static String calculateSeries(int a, int b, int n) {
        String result = new String();
        int s = a;

        for (int i = 0; i < n; i++) {
            int t = (int) Math.pow(2, i);
            s += t * b;
            result = result + "" + s + " ";
        }

        return result;
    }
}
