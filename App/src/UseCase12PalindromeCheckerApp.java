import java.util.Stack;
import java.util.ArrayDeque;

interface PalindromeStrategy {
    boolean check(String word);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        ArrayDeque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()) {
            deque.add(c);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeStrategy strategy = new StackStrategy();

        if(strategy.check(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

    }
}