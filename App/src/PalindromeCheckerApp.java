//usecase5;
import java.util.Stack;


public class PalindromeCheckerApp {

    
    public static void main(String[] args) {

    
        String input = "noon";

        
        Stack<Character> stack = new Stack<>();

        
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Compare characters by popping from stack.
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result.
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}