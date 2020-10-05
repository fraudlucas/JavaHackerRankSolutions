package java8.dataStructures.dequeue;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> uniques = new HashSet<>();
        int maximumUniques = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            uniques.add(num);

            if (deque.size() == m) {
                int uniquesSize = uniques.size();
                if (uniquesSize > maximumUniques) maximumUniques = uniquesSize;

                int dequeHead = deque.remove();
                if (!deque.contains(dequeHead)) uniques.remove(dequeHead);
            }
        }

        System.out.println(maximumUniques);

        in.close();
    }
}
