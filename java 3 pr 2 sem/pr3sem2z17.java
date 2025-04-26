import java.util.Stack;

public class ParenthesisChecker {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Если символ - открывающая скобка, добавляем в стек
            if (ch == '(') {
                stack.push(ch);
            }
            // Если символ - закрывающая скобка
            else if (ch == ')') {
                // Проверяем, есть ли соответствующая открывающая скобка
                if (stack.isEmpty()) {
                    return false; // Если стека нет, значит скобки не сбалансированы
                }
                stack.pop(); // Убираем последнюю открывающую скобку из стека
            }
        }

        // Если стек пуст, значит все скобки сбалансированы
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("(00((())))")); // true
        System.out.println(isValid("(((()()")); // false
    }
}
