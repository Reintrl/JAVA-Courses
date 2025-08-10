package HomeWork16;

import java.util.ArrayDeque;

public class Task3 {
    public static void main(String[] args) {
        String line = "([{{[(())]}}])";
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Не сбалансирована");
                    return;
                }

                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    System.out.println("Не сбалансирована");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Сбалансирована");
        } else {
            System.out.println("Не сбалансирована");
        }
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }
}
