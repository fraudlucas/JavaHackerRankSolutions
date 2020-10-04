package daysOfCode30.day20Sorting;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        // Write Your Code Here
        int totalSwaps = 0;

        for (int i = 0; i < a.length; i++) {
            // Track number of elements swapped during a single array traversal
            int traversalSwaps = 0;

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    traversalSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (traversalSwaps == 0) {
                break;
            }
            totalSwaps += traversalSwaps;
        }

        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

}