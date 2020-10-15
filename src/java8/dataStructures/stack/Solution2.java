package java8.dataStructures.stack;

import java.util.*;

public class Solution2 {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            System.out.println(isParenthesesBalanced(input));
        }

    }

    private static Map<Character, Character> possibleParentheses;

    static {
        possibleParentheses = new HashMap<>();
        possibleParentheses.put('}', '{');
        possibleParentheses.put(')', '(');
        possibleParentheses.put(']', '[');
    }

    private static boolean isParenthesesBalanced(String combination) {
        Deque<Character> stack = new ArrayDeque();
        char[] combinationArray = combination.toCharArray();

        stack.push(combinationArray[0]);

        for (int i = 1; i < combinationArray.length; i++) {
            char bracket = combinationArray[i];
            if (stack.peekFirst() == possibleParentheses.get(bracket) && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(bracket);
            }
        }

        return stack.isEmpty();
    }

}
