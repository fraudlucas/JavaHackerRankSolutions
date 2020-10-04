package java8.dataStructures.stack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isParenthesesBalanced(input));
        }

    }

    private static Map<Character, Character> possibleParentheses;
    static {
        possibleParentheses = new HashMap<>();
        possibleParentheses.put('{', '}');
        possibleParentheses.put('(', ')');
        possibleParentheses.put('[', ']');
    }

    private static boolean isParenthesesBalanced(String combination) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < combination.length(); i++) {
            char current = combination.charAt(i);

            if (possibleParentheses.containsKey(current)) {
                stack.push(current);
            } else if (stack.isEmpty() || current != possibleParentheses.get(stack.pop())) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

