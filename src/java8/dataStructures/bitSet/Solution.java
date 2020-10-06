package java8.dataStructures.bitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet[] bitSets = new BitSet[2];

        bitSets[0] = new BitSet(n);
        bitSets[1] = new BitSet(n);


        for (int i = 0; i < m; i++) {
            String query = scanner.next();

            int set1 = scanner.nextInt() - 1;
            int set2 = scanner.nextInt() - 1;


            switch (query) {
                case "AND":
                    bitSets[set1].and(bitSets[set2]);
                    break;
                case "OR":
                    bitSets[set1].or(bitSets[set2]);
                    break;
                case "XOR":
                    bitSets[set1].xor(bitSets[set2]);
                    break;
                case "FLIP":
                    bitSets[set1].flip(++set2);
                    break;
                case "SET":
                    bitSets[set1].set(++set2);
                    break;
            }

            System.out.printf("%d %d%n", bitSets[0].cardinality(), bitSets[1].cardinality());
        }

        scanner.close();
    }
}
