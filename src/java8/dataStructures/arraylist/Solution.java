package java8.dataStructures.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraysAmount = scanner.nextInt();
        ArrayList[] arraysGroup = new ArrayList[arraysAmount];

        for (int i = 0; i < arraysAmount; i++) {
            ArrayList<Integer> simpleArray = new ArrayList<>();
            int elementsAmount = scanner.nextInt();

            for (int j = 0; j < elementsAmount; j++) {
                simpleArray.add(scanner.nextInt());
            }

            arraysGroup[i] = simpleArray;
        }

        int queries = scanner.nextInt();

        while (queries-- > 0) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            try {
                System.out.println(arraysGroup[x].get(y));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}