package daysOfCode30.day14Scope;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int smallest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        for (int i = 0; i < this.elements.length; i++) {
            smallest = Math.min(this.elements[i], smallest);
            highest = Math.max(this.elements[i], highest);
        }

        this.maximumDifference = highest - smallest;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
