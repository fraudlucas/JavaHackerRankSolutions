package java8.bigNumber.bigDecimal;

import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2]; // 'n+2' does not make any sense.
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        // Cleaning the 'n+2' mistake:
        String[] cleanedArray = Arrays.stream(s).filter(Objects::nonNull).toArray(String[]::new);
        s = cleanedArray;
        Arrays.sort(s, (s1, s2) -> {
            BigDecimal decimalA = new BigDecimal(s1);
            BigDecimal decimalB = new BigDecimal(s2);

            return decimalB.compareTo(decimalA);
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
