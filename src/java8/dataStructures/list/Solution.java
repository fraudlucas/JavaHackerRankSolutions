package java8.dataStructures.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int queries = scanner.nextInt();

        while(queries-- > 0) {
            scanner.nextLine();

            String command = scanner.nextLine();
            int index = scanner.nextInt();

            switch (command) {
                case "Insert":
                    int element = scanner.nextInt();
                    list.add(index, element);
                    break;
                case "Delete":
                    list.remove(index);
                    break;
            }
        }

        for (int element : list) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
